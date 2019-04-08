"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var URI = require("urijs");
var api_1 = require("./api");
var TrainingMaterialsService = /** @class */ (function () {
    function TrainingMaterialsService(basePath, token) {
        this.token = token;
        this.basePath = basePath;
    }
    /**
     * Create training material
     * @summary Create a trainingMaterial
     * @param body Payload
    */
    TrainingMaterialsService.prototype.createTrainingMaterial = function (body) {
        var uri = new URI(this.basePath + "/trainingMaterials");
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
     * Delete a training material
     * @summary Delete trainingMaterial
     * @param trainingMaterialId trainingMaterial id
    */
    TrainingMaterialsService.prototype.deleteTrainingMaterial = function (trainingMaterialId) {
        var uri = new URI(this.basePath + "/trainingMaterials/" + encodeURIComponent(String(trainingMaterialId)));
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
     * Finds a training material
     * @summary Finds a trainingMaterial
     * @param trainingMaterialId trainingMaterial id
    */
    TrainingMaterialsService.prototype.findTrainingMaterial = function (trainingMaterialId) {
        var uri = new URI(this.basePath + "/trainingMaterials/" + encodeURIComponent(String(trainingMaterialId)));
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
     * List training materials
     * @summary List trainingMaterials
     * @param storyId story id
     * @param type training material type
    */
    TrainingMaterialsService.prototype.listTrainingMaterials = function (storyId, type) {
        var uri = new URI(this.basePath + "/trainingMaterials");
        if (storyId !== undefined && storyId !== null) {
            uri.addQuery('storyId', storyId);
        }
        if (type !== undefined && type !== null) {
            uri.addQuery('type', type);
        }
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
     * Updates a training material
     * @summary Updates trainingMaterial
     * @param body Payload
     * @param trainingMaterialId trainingMaterial id
    */
    TrainingMaterialsService.prototype.updateTrainingMaterial = function (body, trainingMaterialId) {
        var uri = new URI(this.basePath + "/trainingMaterials/" + encodeURIComponent(String(trainingMaterialId)));
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
    return TrainingMaterialsService;
}());
exports.TrainingMaterialsService = TrainingMaterialsService;
