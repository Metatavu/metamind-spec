"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var URI = require("urijs");
var api_1 = require("./api");
var StoriesService = /** @class */ (function () {
    function StoriesService(basePath, token) {
        this.token = token;
        this.basePath = basePath;
    }
    /**
     * Create story
     * @summary Create a story
     * @param body Payload
    */
    StoriesService.prototype.createStory = function (body) {
        var uri = new URI(this.basePath + "/stories");
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
     * Delete a story
     * @summary Delete story
     * @param storyId story id
    */
    StoriesService.prototype.deleteStory = function (storyId) {
        var uri = new URI(this.basePath + "/stories/" + encodeURIComponent(String(storyId)));
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
     * Finds a story
     * @summary Finds a story
     * @param storyId story id
    */
    StoriesService.prototype.findStory = function (storyId) {
        var uri = new URI(this.basePath + "/stories/" + encodeURIComponent(String(storyId)));
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
     * List stories
     * @summary List stories
    */
    StoriesService.prototype.listStories = function () {
        var uri = new URI(this.basePath + "/stories");
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
     * Updates a story
     * @summary Updates story
     * @param body Payload
     * @param storyId story id
    */
    StoriesService.prototype.updateStory = function (body, storyId) {
        var uri = new URI(this.basePath + "/stories/" + encodeURIComponent(String(storyId)));
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
    return StoriesService;
}());
exports.StoriesService = StoriesService;
