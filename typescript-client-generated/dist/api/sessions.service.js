"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var URI = require("urijs");
var api_1 = require("./api");
var SessionsService = /** @class */ (function () {
    function SessionsService(basePath, token) {
        this.token = token;
        this.basePath = basePath;
    }
    /**
     * Creates new chat session
     * @summary Creates new session
     * @param body Payload
     * @param storyId story id
    */
    SessionsService.prototype.createSession = function (body, storyId) {
        var uri = new URI(this.basePath + "/stories/" + encodeURIComponent(String(storyId)) + "/sessions");
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
    return SessionsService;
}());
exports.SessionsService = SessionsService;
