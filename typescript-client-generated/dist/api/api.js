"use strict";
function __export(m) {
    for (var p in m) if (!exports.hasOwnProperty(p)) exports[p] = m[p];
}
Object.defineProperty(exports, "__esModule", { value: true });
__export(require("./intents.service"));
var intents_service_1 = require("./intents.service");
__export(require("./knots.service"));
var knots_service_1 = require("./knots.service");
__export(require("./messages.service"));
var messages_service_1 = require("./messages.service");
__export(require("./scripts.service"));
var scripts_service_1 = require("./scripts.service");
__export(require("./sessions.service"));
var sessions_service_1 = require("./sessions.service");
__export(require("./stories.service"));
var stories_service_1 = require("./stories.service");
__export(require("./trainingMaterials.service"));
var trainingMaterials_service_1 = require("./trainingMaterials.service");
__export(require("./variables.service"));
var variables_service_1 = require("./variables.service");
var ApiUtils = /** @class */ (function () {
    function ApiUtils() {
    }
    /**
     * Handles response from API
     *
     * @param response response object
     */
    ApiUtils.handleResponse = function (response) {
        switch (response.status) {
            case 204:
                return {};
            default:
                return response.json();
        }
    };
    return ApiUtils;
}());
exports.ApiUtils = ApiUtils;
exports.default = new /** @class */ (function () {
    function Api() {
        this.apiUrl = "http://localhost";
    }
    /**
     * Configures api endpoint
     *
     */
    Api.prototype.configure = function (baseUrl) {
        this.apiUrl = baseUrl;
    };
    Api.prototype.getIntentsService = function (token) {
        return new intents_service_1.IntentsService(this.apiUrl, token);
    };
    Api.prototype.getKnotsService = function (token) {
        return new knots_service_1.KnotsService(this.apiUrl, token);
    };
    Api.prototype.getMessagesService = function (token) {
        return new messages_service_1.MessagesService(this.apiUrl, token);
    };
    Api.prototype.getScriptsService = function (token) {
        return new scripts_service_1.ScriptsService(this.apiUrl, token);
    };
    Api.prototype.getSessionsService = function (token) {
        return new sessions_service_1.SessionsService(this.apiUrl, token);
    };
    Api.prototype.getStoriesService = function (token) {
        return new stories_service_1.StoriesService(this.apiUrl, token);
    };
    Api.prototype.getTrainingMaterialsService = function (token) {
        return new trainingMaterials_service_1.TrainingMaterialsService(this.apiUrl, token);
    };
    Api.prototype.getVariablesService = function (token) {
        return new variables_service_1.VariablesService(this.apiUrl, token);
    };
    return Api;
}());
