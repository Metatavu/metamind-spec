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

(function(factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/BadRequest', 'model/Forbidden', 'model/InternalServerError', 'model/Message', 'model/NotFound', 'model/NotImplemented', 'model/Script', 'model/Session', 'api/MessagesApi', 'api/ScriptsApi', 'api/SessionsApi'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('./ApiClient'), require('./model/BadRequest'), require('./model/Forbidden'), require('./model/InternalServerError'), require('./model/Message'), require('./model/NotFound'), require('./model/NotImplemented'), require('./model/Script'), require('./model/Session'), require('./api/MessagesApi'), require('./api/ScriptsApi'), require('./api/SessionsApi'));
  }
}(function(ApiClient, BadRequest, Forbidden, InternalServerError, Message, NotFound, NotImplemented, Script, Session, MessagesApi, ScriptsApi, SessionsApi) {
  'use strict';

  /**
   * Brain_spec_for_Metamind_.<br>
   * The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
   * <p>
   * An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
   * <pre>
   * var MetamindClient = require('index'); // See note below*.
   * var xxxSvc = new MetamindClient.XxxApi(); // Allocate the API class we're going to use.
   * var yyyModel = new MetamindClient.Yyy(); // Construct a model instance.
   * yyyModel.someProperty = 'someValue';
   * ...
   * var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
   * ...
   * </pre>
   * <em>*NOTE: For a top-level AMD script, use require(['index'], function(){...})
   * and put the application logic within the callback function.</em>
   * </p>
   * <p>
   * A non-AMD browser application (discouraged) might do something like this:
   * <pre>
   * var xxxSvc = new MetamindClient.XxxApi(); // Allocate the API class we're going to use.
   * var yyy = new MetamindClient.Yyy(); // Construct a model instance.
   * yyyModel.someProperty = 'someValue';
   * ...
   * var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
   * ...
   * </pre>
   * </p>
   * @module index
   * @version 0.0.27
   */
  var exports = {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient: ApiClient,
    /**
     * The BadRequest model constructor.
     * @property {module:model/BadRequest}
     */
    BadRequest: BadRequest,
    /**
     * The Forbidden model constructor.
     * @property {module:model/Forbidden}
     */
    Forbidden: Forbidden,
    /**
     * The InternalServerError model constructor.
     * @property {module:model/InternalServerError}
     */
    InternalServerError: InternalServerError,
    /**
     * The Message model constructor.
     * @property {module:model/Message}
     */
    Message: Message,
    /**
     * The NotFound model constructor.
     * @property {module:model/NotFound}
     */
    NotFound: NotFound,
    /**
     * The NotImplemented model constructor.
     * @property {module:model/NotImplemented}
     */
    NotImplemented: NotImplemented,
    /**
     * The Script model constructor.
     * @property {module:model/Script}
     */
    Script: Script,
    /**
     * The Session model constructor.
     * @property {module:model/Session}
     */
    Session: Session,
    /**
     * The MessagesApi service constructor.
     * @property {module:api/MessagesApi}
     */
    MessagesApi: MessagesApi,
    /**
     * The ScriptsApi service constructor.
     * @property {module:api/ScriptsApi}
     */
    ScriptsApi: ScriptsApi,
    /**
     * The SessionsApi service constructor.
     * @property {module:api/SessionsApi}
     */
    SessionsApi: SessionsApi
  };

  return exports;
}));
