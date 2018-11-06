/*global module:false*/

const fs = require('fs');

module.exports = function(grunt) {
  require('load-grunt-tasks')(grunt);
  
  const JAVASCRIPT_VERSION = require('./javascript-generated/package.json').version;
  const PHP_CLIENT_VERSION = "0.0.1";
  const SWAGGER_SRC = "https://oss.sonatype.org/content/repositories/snapshots/io/swagger/swagger-codegen-cli/3.0.0-SNAPSHOT/swagger-codegen-cli-3.0.0-20180112.231857-20.jar";
  
  grunt.registerMultiTask('javascript-package-update', 'Updates package.json -file', function () {
    const packageJson = JSON.parse(fs.readFileSync('javascript-generated/package.json'));
    fs.writeFileSync('javascript-generated/package.json', JSON.stringify(Object.assign(packageJson, this.data.fields), null, 2));
  });

  grunt.initConfig({
    'curl': {
      'swagger-codegen':  {
        src: SWAGGER_SRC,
        dest: 'swagger-codegen-cli.jar'
      }
    },
    'clean': {
      'jaxrs-spec-cruft': [
        'jaxrs-spec-generated/src/main/java/fi/metatavu/metamind/server/RestApplication.java'
      ],
      'jaxrs-spec-sources': ['jaxrs-spec-generated/src']
    },
    'shell': {
      'jaxrs-spec-generate': {
        command : 'mv jaxrs-spec-generated/pom.xml jaxrs-spec-generated/pom.xml.before && ' +
          'java -jar swagger-codegen-cli.jar generate ' +
          '-i ./swagger.yaml ' +
          '-l jaxrs-spec ' +
          '--api-package fi.metatavu.metamind.server.rest ' +
          '--model-package fi.metatavu.metamind.server.rest.model ' +
          '--group-id fi.metatavu.metamind ' +
          '--artifact-id metamind-spec ' +
          '--artifact-version `cat jaxrs-spec-generated/pom.xml.before|grep version -m 1|sed -e \'s/.*<version>//\'|sed -e \'s/<.*//\'` ' +
          '--template-dir jaxrs-spec-templates ' +
          '--additional-properties dateLibrary=java8,useBeanValidation=true,sourceFolder=src/main/java,interfaceOnly=true,returnResponse=true ' +
          '-o jaxrs-spec-generated/'
      },
      'jaxrs-spec-install': {
        command : 'mvn install',
        options: {
          execOptions: {
            cwd: 'jaxrs-spec-generated'
          }
        }
      },
      'jaxrs-spec-release': {
        command : 'git add src pom.xml swagger.json && git commit -m "Generated source" && git push && mvn -B release:clean release:prepare release:perform',
        options: {
          execOptions: {
            cwd: 'jaxrs-spec-generated'
          }
        }
      },
      'javascript-generate': {
        command : 'java -jar swagger-codegen-cli.jar generate ' +
          '-i ./swagger.yaml ' +
          '-l javascript ' +
          '-o javascript-generated/ ' +
          `--additional-properties useES6=false,usePromises=true,projectName=metamind-client,projectVersion=${JAVASCRIPT_VERSION}`
      },
      'javascript-bump-version': {
        command: 'npm version patch',
        options: {
          execOptions: {
            cwd: 'javascript-generated'
          }
        }
      },
      'javascript-push': {
        command : 'git add . && git commit -m "Generated javascript source" ; git push',
        options: {
          execOptions: {
            cwd: 'javascript-generated'
          }
        }
      },
      'javascript-publish': {
        command : 'npm publish',
        options: {
          execOptions: {
            cwd: 'javascript-generated'
          }
        }
      },
      'php-client-generate': {
        command : 'java -jar swagger-codegen-cli.jar generate ' +
          '-i ./swagger.yaml ' +
          '-l php ' +
          '--template-dir php-templates ' +
          '-o php-generated ' +
          '--additional-properties packagePath=metamind-client-php,composerVendorName=metatavu,composerProjectName=metamind-client-php,variableNamingConvention=camelCase,invokerPackage=Metatavu\\\\Metamind,apiPackage=Api,modelPackage=Api\\\\Model,artifactVersion=' + PHP_CLIENT_VERSION
      },
      'php-client-publish': {
        command : 'sh git_push.sh',
        options: {
          execOptions: {
            cwd: 'php-generated/metamind-client-php'
          }
        }
      },
      'typescript-generate': {
        command : 'java -jar swagger-codegen-cli.jar generate ' +
          '-i ./swagger.yaml ' +
          '-l typescript-fetch ' +
          '-t typescript-template/ ' +
          '-o typescript-generated/ ' +
          '--type-mappings Date=string ' +
          '--additional-properties projectName=metamind-ts-client,npmName=metamind-ts-client,npmVersion=' + require('./typescript-generated/package.json').version
      },
      'typescript-bump-version': {
        command: 'npm version patch',
        options: {
          execOptions: {
            cwd: 'typescript-generated'
          }
        }
      },
      'typescript-push': {
        command : 'git add . && git commit -m "Generated javascript source" && git push',
        options: {
          execOptions: {
            cwd: 'typescript-generated'
          }
        }
      }
    },
    'publish': {
      'publish-typescript-client': {
        src: ['typescript-generated']
      }
    },
    'javascript-package-update': {
      'javascript-package': {
        'fields': {
          "author": "Metatavu Oy",
          "repository": {
            "type": "git",
            "url": "git://github.com/Metatavu/metamind-client.git"
          },
          "license": "gpl-3.0"
        }
      }
    }
  });
  
  grunt.registerTask('download-dependencies', 'if-missing:curl:swagger-codegen');
  grunt.registerTask('javascript-gen', [ 'download-dependencies', 'shell:javascript-generate', 'javascript-package-update:javascript-package' ]);
  grunt.registerTask('javascript', [ 'javascript-gen', 'shell:javascript-bump-version', 'shell:javascript-push', 'shell:javascript-publish']);
  grunt.registerTask('jaxrs-gen', [ 'download-dependencies', 'clean:jaxrs-spec-sources', 'shell:jaxrs-spec-generate', 'clean:jaxrs-spec-cruft', 'shell:jaxrs-spec-install' ]);
  grunt.registerTask('jaxrs-spec', [ 'jaxrs-gen', 'shell:jaxrs-spec-release' ]);
  grunt.registerTask('php-gen', [ "shell:php-client-generate" ]);
  grunt.registerTask('php', [ "php-gen", "shell:php-client-publish" ]);
  grunt.registerTask('typescript-gen', [ 'download-dependencies', 'shell:typescript-generate']);
  grunt.registerTask('typescript', ['typescript-gen', 'shell:typescript-bump-version', 'shell:typescript-push', 'publish:publish-typescript-client']);

  grunt.registerTask('default', ['javascript', 'jaxrs-spec', "php", "typescript"]);
  
};
