"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var URI = require("urijs");
var api_1 = require("./api");
var KnotsService = /** @class */ (function () {
    function KnotsService(basePath, token) {
        this.token = token;
        this.basePath = basePath;
    }
    /**
     * Create story knot
     * @summary Create a story knot
     * @param body Payload
     * @param storyId story id
    */
    KnotsService.prototype.createKnot = function (body, storyId) {
        var uri = new URI(this.basePath + "/stories/" + encodeURIComponent(String(storyId)) + "/knots");
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
     * Delete a knot
     * @summary Delete knot
     * @param storyId story id
     * @param knotId knot id
    */
    KnotsService.prototype.deleteKnot = function (storyId, knotId) {
        var uri = new URI(this.basePath + "/stories/" + encodeURIComponent(String(storyId)) + "/knots/" + encodeURIComponent(String(knotId)));
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
     * Finds a story knot
     * @summary Finds a story knot
     * @param storyId story id
     * @param knotId knot id
    */
    KnotsService.prototype.findKnot = function (storyId, knotId) {
        var uri = new URI(this.basePath + "/stories/" + encodeURIComponent(String(storyId)) + "/knots/" + encodeURIComponent(String(knotId)));
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
     * List story knots
     * @summary List story knots
     * @param storyId story id
    */
    KnotsService.prototype.listKnots = function (storyId) {
        var uri = new URI(this.basePath + "/stories/" + encodeURIComponent(String(storyId)) + "/knots");
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
     * Updates a knot
     * @summary Updates knot
     * @param body Payload
     * @param storyId story id
     * @param knotId knot id
    */
    KnotsService.prototype.updateKnot = function (body, storyId, knotId) {
        var uri = new URI(this.basePath + "/stories/" + encodeURIComponent(String(storyId)) + "/knots/" + encodeURIComponent(String(knotId)));
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
    return KnotsService;
}());
exports.KnotsService = KnotsService;
