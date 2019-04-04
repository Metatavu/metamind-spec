"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var URI = require("urijs");
var api_1 = require("./api");
var ScriptsService = /** @class */ (function () {
    function ScriptsService(basePath, token) {
        this.token = token;
        this.basePath = basePath;
    }
    /**
     * Create script
     * @summary Create a script
     * @param body Payload
    */
    ScriptsService.prototype.createScript = function (body) {
        var uri = new URI(this.basePath + "/scripts");
        var options = {
            method: "post",
            headers: {
                "Content-Type": "application/json",
                "Authorization": "Bearer " + this.token
            },
            body: JSON.stringify(body)
        };
        return fetch(uri.toString(), options).then(function (response) {
            return api_1.ApiUtils.handleResponse(response);
        });
    };
    /**
     * Delete a script
     * @summary Delete script
     * @param scriptId script id
    */
    ScriptsService.prototype.deleteScript = function (scriptId) {
        var uri = new URI(this.basePath + "/scripts/" + encodeURIComponent(String(scriptId)));
        var options = {
            method: "delete",
            headers: {
                "Content-Type": "application/json",
                "Authorization": "Bearer " + this.token
            }
        };
        return fetch(uri.toString(), options).then(function (response) {
            return api_1.ApiUtils.handleResponse(response);
        });
    };
    /**
     * Finds a script
     * @summary Finds a script
     * @param scriptId script id
    */
    ScriptsService.prototype.findScript = function (scriptId) {
        var uri = new URI(this.basePath + "/scripts/" + encodeURIComponent(String(scriptId)));
        var options = {
            method: "get",
            headers: {
                "Content-Type": "application/json",
                "Authorization": "Bearer " + this.token
            }
        };
        return fetch(uri.toString(), options).then(function (response) {
            return api_1.ApiUtils.handleResponse(response);
        });
    };
    /**
     * List scripts
     * @summary List scripts
    */
    ScriptsService.prototype.listScripts = function () {
        var uri = new URI(this.basePath + "/scripts");
        var options = {
            method: "get",
            headers: {
                "Content-Type": "application/json",
                "Authorization": "Bearer " + this.token
            }
        };
        return fetch(uri.toString(), options).then(function (response) {
            return api_1.ApiUtils.handleResponse(response);
        });
    };
    /**
     * Updates a script
     * @summary Updates script
     * @param body Payload
     * @param scriptId script id
    */
    ScriptsService.prototype.updateScript = function (body, scriptId) {
        var uri = new URI(this.basePath + "/scripts/" + encodeURIComponent(String(scriptId)));
        var options = {
            method: "put",
            headers: {
                "Content-Type": "application/json",
                "Authorization": "Bearer " + this.token
            },
            body: JSON.stringify(body)
        };
        return fetch(uri.toString(), options).then(function (response) {
            return api_1.ApiUtils.handleResponse(response);
        });
    };
    return ScriptsService;
}());
exports.ScriptsService = ScriptsService;
