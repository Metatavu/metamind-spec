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
    root.MetamindClient.Session = factory(root.MetamindClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The Session model module.
   * @module model/Session
   * @version 0.0.23
   */

  /**
   * Constructs a new <code>Session</code>.
   * @alias module:model/Session
   * @class
   */
  var exports = function() {
    var _this = this;







  };

  /**
   * Constructs a <code>Session</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Session} obj Optional instance to populate.
   * @return {module:model/Session} The populated <code>Session</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('locale')) {
        obj['locale'] = ApiClient.convertToType(data['locale'], 'String');
      }
      if (data.hasOwnProperty('timeZone')) {
        obj['timeZone'] = ApiClient.convertToType(data['timeZone'], 'String');
      }
      if (data.hasOwnProperty('visitor')) {
        obj['visitor'] = ApiClient.convertToType(data['visitor'], 'String');
      }
      if (data.hasOwnProperty('story')) {
        obj['story'] = ApiClient.convertToType(data['story'], 'String');
      }
      if (data.hasOwnProperty('created')) {
        obj['created'] = ApiClient.convertToType(data['created'], 'Date');
      }
    }
    return obj;
  }

  /**
   * Session id.
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * Session locale
   * @member {String} locale
   */
  exports.prototype['locale'] = undefined;
  /**
   * Session time zone
   * @member {String} timeZone
   */
  exports.prototype['timeZone'] = undefined;
  /**
   * Visitor details
   * @member {String} visitor
   */
  exports.prototype['visitor'] = undefined;
  /**
   * Story name
   * @member {String} story
   */
  exports.prototype['story'] = undefined;
  /**
   * Time the session was initiated
   * @member {Date} created
   */
  exports.prototype['created'] = undefined;



  return exports;
}));


