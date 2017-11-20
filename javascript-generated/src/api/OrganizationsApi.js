/**
 * Metamind API
 * Brain spec for Metamind.
 *
 * OpenAPI spec version: 0.0.1
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.0-SNAPSHOT
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/BadRequest', 'model/Forbidden', 'model/InternalServerError', 'model/Message'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/BadRequest'), require('../model/Forbidden'), require('../model/InternalServerError'), require('../model/Message'));
  } else {
    // Browser globals (root is window)
    if (!root.MetamindClient) {
      root.MetamindClient = {};
    }
    root.MetamindClient.OrganizationsApi = factory(root.MetamindClient.ApiClient, root.MetamindClient.BadRequest, root.MetamindClient.Forbidden, root.MetamindClient.InternalServerError, root.MetamindClient.Message);
  }
}(this, function(ApiClient, BadRequest, Forbidden, InternalServerError, Message) {
  'use strict';

  /**
   * Organizations service.
   * @module api/OrganizationsApi
   * @version 0.0.6
   */

  /**
   * Constructs a new OrganizationsApi. 
   * @alias module:api/OrganizationsApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;



    /**
     * Posts new message
     * Posts new message
     * @param {module:model/Message} body Payload
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/Message} and HTTP response
     */
    this.postMessageWithHttpInfo = function(body) {
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling postMessage");
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

      var authNames = [];
      var contentTypes = ['application/json;charset=utf-8'];
      var accepts = ['application/json;charset=utf-8'];
      var returnType = Message;

      return this.apiClient.callApi(
        '/messages/', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Posts new message
     * Posts new message
     * @param {module:model/Message} body Payload
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/Message}
     */
    this.postMessage = function(body) {
      return this.postMessageWithHttpInfo(body)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }
  };

  return exports;
}));
