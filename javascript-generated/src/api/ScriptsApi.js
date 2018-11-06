/**
 * Metamind API
 * Brain spec for Metamind.
 *
 * OpenAPI spec version: 0.0.1
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.0-SNAPSHOT
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/BadRequest', 'model/Forbidden', 'model/InternalServerError', 'model/Script'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/BadRequest'), require('../model/Forbidden'), require('../model/InternalServerError'), require('../model/Script'));
  } else {
    // Browser globals (root is window)
    if (!root.MetamindClient) {
      root.MetamindClient = {};
    }
    root.MetamindClient.ScriptsApi = factory(root.MetamindClient.ApiClient, root.MetamindClient.BadRequest, root.MetamindClient.Forbidden, root.MetamindClient.InternalServerError, root.MetamindClient.Script);
  }
}(this, function(ApiClient, BadRequest, Forbidden, InternalServerError, Script) {
  'use strict';

  /**
   * Scripts service.
   * @module api/ScriptsApi
   * @version 0.0.26
   */

  /**
   * Constructs a new ScriptsApi. 
   * @alias module:api/ScriptsApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;



    /**
     * Posts new script
     * Posts new script
     * @param {module:model/Script} body Payload
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/Script} and HTTP response
     */
    this.createScriptWithHttpInfo = function(body) {
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling createScript");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['basicAuth'];
      var contentTypes = ['application/json;charset=utf-8'];
      var accepts = ['application/json;charset=utf-8'];
      var returnType = Script;

      return this.apiClient.callApi(
        '/scripts', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Posts new script
     * Posts new script
     * @param {module:model/Script} body Payload
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/Script}
     */
    this.createScript = function(body) {
      return this.createScriptWithHttpInfo(body)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }
  };

  return exports;
}));
