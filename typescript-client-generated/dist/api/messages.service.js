"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var URI = require("urijs");
var api_1 = require("./api");
var MessagesService = /** @class */ (function () {
    function MessagesService(basePath, token) {
        this.token = token;
        this.basePath = basePath;
    }
    /**
     * Posts new message
     * @summary Posts new message
     * @param body Payload
     * @param storyId story id
    */
    MessagesService.prototype.createMessage = function (body, storyId) {
        var uri = new URI(this.basePath + "/stories/" + encodeURIComponent(String(storyId)) + "/messages");
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
    return MessagesService;
}());
exports.MessagesService = MessagesService;
