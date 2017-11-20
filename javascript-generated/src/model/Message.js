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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.MetamindClient) {
      root.MetamindClient = {};
    }
    root.MetamindClient.Message = factory(root.MetamindClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The Message model module.
   * @module model/Message
   * @version 0.0.3
   */

  /**
   * Constructs a new <code>Message</code>.
   * @alias module:model/Message
   * @class
   */
  var exports = function() {
    var _this = this;








  };

  /**
   * Constructs a <code>Message</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Message} obj Optional instance to populate.
   * @return {module:model/Message} The populated <code>Message</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('sessionId')) {
        obj['sessionId'] = ApiClient.convertToType(data['sessionId'], 'String');
      }
      if (data.hasOwnProperty('content')) {
        obj['content'] = ApiClient.convertToType(data['content'], 'String');
      }
      if (data.hasOwnProperty('response')) {
        obj['response'] = ApiClient.convertToType(data['response'], 'String');
      }
      if (data.hasOwnProperty('hint')) {
        obj['hint'] = ApiClient.convertToType(data['hint'], 'String');
      }
      if (data.hasOwnProperty('quickResponses')) {
        obj['quickResponses'] = ApiClient.convertToType(data['quickResponses'], ['String']);
      }
      if (data.hasOwnProperty('created')) {
        obj['created'] = ApiClient.convertToType(data['created'], 'Date');
      }
    }
    return obj;
  }

  /**
   * Message id
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * Session id the message belongs to
   * @member {String} sessionId
   */
  exports.prototype['sessionId'] = undefined;
  /**
   * Message content
   * @member {String} content
   */
  exports.prototype['content'] = undefined;
  /**
   * Response text. Used only when responding
   * @member {String} response
   */
  exports.prototype['response'] = undefined;
  /**
   * Hint text. Used only when responding
   * @member {String} hint
   */
  exports.prototype['hint'] = undefined;
  /**
   * List of quick responses. Used only when responding
   * @member {Array.<String>} quickResponses
   */
  exports.prototype['quickResponses'] = undefined;
  /**
   * Time the session was initiated
   * @member {Date} created
   */
  exports.prototype['created'] = undefined;



  return exports;
}));


