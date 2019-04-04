"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var URI = require("urijs");
var api_1 = require("./api");
var IntentsService = /** @class */ (function () {
    function IntentsService(basePath, token) {
        this.token = token;
        this.basePath = basePath;
    }
    /**
     * Create story intent
     * @summary Create a story intent
     * @param body Payload
     * @param storyId story id
    */
    IntentsService.prototype.createIntent = function (body, storyId) {
        var uri = new URI(this.basePath + "/stories/" + encodeURIComponent(String(storyId)) + "/intents");
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
     * Delete a intent
     * @summary Delete intent
     * @param storyId story id
     * @param intentId intent id
    */
    IntentsService.prototype.deleteIntent = function (storyId, intentId) {
        var uri = new URI(this.basePath + "/stories/" + encodeURIComponent(String(storyId)) + "/intents/" + encodeURIComponent(String(intentId)));
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
     * Finds a story intent
     * @summary Finds a story intent
     * @param storyId story id
     * @param intentId intent id
    */
    IntentsService.prototype.findIntent = function (storyId, intentId) {
        var uri = new URI(this.basePath + "/stories/" + encodeURIComponent(String(storyId)) + "/intents/" + encodeURIComponent(String(intentId)));
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
     * List story intents
     * @summary List story intents
     * @param storyId story id
    */
    IntentsService.prototype.listIntents = function (storyId) {
        var uri = new URI(this.basePath + "/stories/" + encodeURIComponent(String(storyId)) + "/intents");
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
     * Updates a intent
     * @summary Updates intent
     * @param body Payload
     * @param storyId story id
     * @param intentId intent id
    */
    IntentsService.prototype.updateIntent = function (body, storyId, intentId) {
        var uri = new URI(this.basePath + "/stories/" + encodeURIComponent(String(storyId)) + "/intents/" + encodeURIComponent(String(intentId)));
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
    return IntentsService;
}());
exports.IntentsService = IntentsService;
