"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var URI = require("urijs");
var api_1 = require("./api");
var VariablesService = /** @class */ (function () {
    function VariablesService(basePath, token) {
        this.token = token;
        this.basePath = basePath;
    }
    /**
     * Create story variable
     * @summary Create a story variable
     * @param body Payload
     * @param storyId story id
    */
    VariablesService.prototype.createVariable = function (body, storyId) {
        var uri = new URI(this.basePath + "/stories/" + encodeURIComponent(String(storyId)) + "/variables");
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
     * Delete a variable
     * @summary Delete variable
     * @param storyId story id
     * @param variableId variable id
    */
    VariablesService.prototype.deleteVariable = function (storyId, variableId) {
        var uri = new URI(this.basePath + "/stories/" + encodeURIComponent(String(storyId)) + "/variables/" + encodeURIComponent(String(variableId)));
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
     * Finds a story variable
     * @summary Finds a story variable
     * @param storyId story id
     * @param variableId variable id
    */
    VariablesService.prototype.findVariable = function (storyId, variableId) {
        var uri = new URI(this.basePath + "/stories/" + encodeURIComponent(String(storyId)) + "/variables/" + encodeURIComponent(String(variableId)));
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
     * List story variables
     * @summary List story variables
     * @param storyId story id
    */
    VariablesService.prototype.listVariables = function (storyId) {
        var uri = new URI(this.basePath + "/stories/" + encodeURIComponent(String(storyId)) + "/variables");
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
     * Updates a variable
     * @summary Updates variable
     * @param body Payload
     * @param storyId story id
     * @param variableId variable id
    */
    VariablesService.prototype.updateVariable = function (body, storyId, variableId) {
        var uri = new URI(this.basePath + "/stories/" + encodeURIComponent(String(storyId)) + "/variables/" + encodeURIComponent(String(variableId)));
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
    return VariablesService;
}());
exports.VariablesService = VariablesService;
