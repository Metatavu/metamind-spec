"use strict";
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : new P(function (resolve) { resolve(result.value); }).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
var __generator = (this && this.__generator) || function (thisArg, body) {
    var _ = { label: 0, sent: function() { if (t[0] & 1) throw t[1]; return t[1]; }, trys: [], ops: [] }, f, y, t, g;
    return g = { next: verb(0), "throw": verb(1), "return": verb(2) }, typeof Symbol === "function" && (g[Symbol.iterator] = function() { return this; }), g;
    function verb(n) { return function (v) { return step([n, v]); }; }
    function step(op) {
        if (f) throw new TypeError("Generator is already executing.");
        while (_) try {
            if (f = 1, y && (t = op[0] & 2 ? y["return"] : op[0] ? y["throw"] || ((t = y["return"]) && t.call(y), 0) : y.next) && !(t = t.call(y, op[1])).done) return t;
            if (y = 0, t) op = [op[0] & 2, t.value];
            switch (op[0]) {
                case 0: case 1: t = op; break;
                case 4: _.label++; return { value: op[1], done: false };
                case 5: _.label++; y = op[1]; op = [0]; continue;
                case 7: op = _.ops.pop(); _.trys.pop(); continue;
                default:
                    if (!(t = _.trys, t = t.length > 0 && t[t.length - 1]) && (op[0] === 6 || op[0] === 2)) { _ = 0; continue; }
                    if (op[0] === 3 && (!t || (op[1] > t[0] && op[1] < t[3]))) { _.label = op[1]; break; }
                    if (op[0] === 6 && _.label < t[1]) { _.label = t[1]; t = op; break; }
                    if (t && _.label < t[2]) { _.label = t[2]; _.ops.push(op); break; }
                    if (t[2]) _.ops.pop();
                    _.trys.pop(); continue;
            }
            op = body.call(thisArg, _);
        } catch (e) { op = [6, e]; y = 0; } finally { f = t = 0; }
        if (op[0] & 5) throw op[1]; return { value: op[0] ? op[1] : void 0, done: true };
    }
};
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
    IntentsService.prototype.createIntent = function (body, storyId, retrying) {
        return __awaiter(this, void 0, void 0, function () {
            var uri, options, response, ticket, authorization, rptToken;
            return __generator(this, function (_a) {
                switch (_a.label) {
                    case 0:
                        uri = new URI(this.basePath + "/stories/" + encodeURIComponent(String(storyId)) + "/intents");
                        options = {
                            method: "post",
                            headers: {
                                "Content-Type": "application/json",
                                "Authorization": "Bearer " + (this.rptToken ? this.rptToken : this.token)
                            },
                            body: JSON.stringify(body)
                        };
                        return [4 /*yield*/, fetch(uri.toString(), options)];
                    case 1:
                        response = _a.sent();
                        if (!(!retrying && response.status == 401)) return [3 /*break*/, 3];
                        ticket = api_1.ApiUtils.getUMATicket(response);
                        authorization = response.headers.get("Authorization");
                        return [4 /*yield*/, api_1.ApiUtils.getRPT(authorization, ticket)];
                    case 2:
                        rptToken = _a.sent();
                        this.rptToken = rptToken ? rptToken["access_token"] : null;
                        if (this.rptToken) {
                            return [2 /*return*/, this.createIntent(body, storyId, true)];
                        }
                        _a.label = 3;
                    case 3: return [2 /*return*/, api_1.ApiUtils.handleResponse(response)];
                }
            });
        });
    };
    /**
     * Delete a intent
     * @summary Delete intent
     * @param storyId story id
     * @param intentId intent id
    */
    IntentsService.prototype.deleteIntent = function (storyId, intentId, retrying) {
        return __awaiter(this, void 0, void 0, function () {
            var uri, options, response, ticket, authorization, rptToken;
            return __generator(this, function (_a) {
                switch (_a.label) {
                    case 0:
                        uri = new URI(this.basePath + "/stories/" + encodeURIComponent(String(storyId)) + "/intents/" + encodeURIComponent(String(intentId)));
                        options = {
                            method: "delete",
                            headers: {
                                "Content-Type": "application/json",
                                "Authorization": "Bearer " + (this.rptToken ? this.rptToken : this.token)
                            }
                        };
                        return [4 /*yield*/, fetch(uri.toString(), options)];
                    case 1:
                        response = _a.sent();
                        if (!(!retrying && response.status == 401)) return [3 /*break*/, 3];
                        ticket = api_1.ApiUtils.getUMATicket(response);
                        authorization = response.headers.get("Authorization");
                        return [4 /*yield*/, api_1.ApiUtils.getRPT(authorization, ticket)];
                    case 2:
                        rptToken = _a.sent();
                        this.rptToken = rptToken ? rptToken["access_token"] : null;
                        if (this.rptToken) {
                            return [2 /*return*/, this.deleteIntent(storyId, intentId, true)];
                        }
                        _a.label = 3;
                    case 3: return [2 /*return*/, api_1.ApiUtils.handleResponse(response)];
                }
            });
        });
    };
    /**
     * Finds a story intent
     * @summary Finds a story intent
     * @param storyId story id
     * @param intentId intent id
    */
    IntentsService.prototype.findIntent = function (storyId, intentId, retrying) {
        return __awaiter(this, void 0, void 0, function () {
            var uri, options, response, ticket, authorization, rptToken;
            return __generator(this, function (_a) {
                switch (_a.label) {
                    case 0:
                        uri = new URI(this.basePath + "/stories/" + encodeURIComponent(String(storyId)) + "/intents/" + encodeURIComponent(String(intentId)));
                        options = {
                            method: "get",
                            headers: {
                                "Content-Type": "application/json",
                                "Authorization": "Bearer " + (this.rptToken ? this.rptToken : this.token)
                            }
                        };
                        return [4 /*yield*/, fetch(uri.toString(), options)];
                    case 1:
                        response = _a.sent();
                        if (!(!retrying && response.status == 401)) return [3 /*break*/, 3];
                        ticket = api_1.ApiUtils.getUMATicket(response);
                        authorization = response.headers.get("Authorization");
                        return [4 /*yield*/, api_1.ApiUtils.getRPT(authorization, ticket)];
                    case 2:
                        rptToken = _a.sent();
                        this.rptToken = rptToken ? rptToken["access_token"] : null;
                        if (this.rptToken) {
                            return [2 /*return*/, this.findIntent(storyId, intentId, true)];
                        }
                        _a.label = 3;
                    case 3: return [2 /*return*/, api_1.ApiUtils.handleResponse(response)];
                }
            });
        });
    };
    /**
     * List story intents
     * @summary List story intents
     * @param storyId story id
    */
    IntentsService.prototype.listIntents = function (storyId, retrying) {
        return __awaiter(this, void 0, void 0, function () {
            var uri, options, response, ticket, authorization, rptToken;
            return __generator(this, function (_a) {
                switch (_a.label) {
                    case 0:
                        uri = new URI(this.basePath + "/stories/" + encodeURIComponent(String(storyId)) + "/intents");
                        options = {
                            method: "get",
                            headers: {
                                "Content-Type": "application/json",
                                "Authorization": "Bearer " + (this.rptToken ? this.rptToken : this.token)
                            }
                        };
                        return [4 /*yield*/, fetch(uri.toString(), options)];
                    case 1:
                        response = _a.sent();
                        if (!(!retrying && response.status == 401)) return [3 /*break*/, 3];
                        ticket = api_1.ApiUtils.getUMATicket(response);
                        authorization = response.headers.get("Authorization");
                        return [4 /*yield*/, api_1.ApiUtils.getRPT(authorization, ticket)];
                    case 2:
                        rptToken = _a.sent();
                        this.rptToken = rptToken ? rptToken["access_token"] : null;
                        if (this.rptToken) {
                            return [2 /*return*/, this.listIntents(storyId, true)];
                        }
                        _a.label = 3;
                    case 3: return [2 /*return*/, api_1.ApiUtils.handleResponse(response)];
                }
            });
        });
    };
    /**
     * Updates a intent
     * @summary Updates intent
     * @param body Payload
     * @param storyId story id
     * @param intentId intent id
    */
    IntentsService.prototype.updateIntent = function (body, storyId, intentId, retrying) {
        return __awaiter(this, void 0, void 0, function () {
            var uri, options, response, ticket, authorization, rptToken;
            return __generator(this, function (_a) {
                switch (_a.label) {
                    case 0:
                        uri = new URI(this.basePath + "/stories/" + encodeURIComponent(String(storyId)) + "/intents/" + encodeURIComponent(String(intentId)));
                        options = {
                            method: "put",
                            headers: {
                                "Content-Type": "application/json",
                                "Authorization": "Bearer " + (this.rptToken ? this.rptToken : this.token)
                            },
                            body: JSON.stringify(body)
                        };
                        return [4 /*yield*/, fetch(uri.toString(), options)];
                    case 1:
                        response = _a.sent();
                        if (!(!retrying && response.status == 401)) return [3 /*break*/, 3];
                        ticket = api_1.ApiUtils.getUMATicket(response);
                        authorization = response.headers.get("Authorization");
                        return [4 /*yield*/, api_1.ApiUtils.getRPT(authorization, ticket)];
                    case 2:
                        rptToken = _a.sent();
                        this.rptToken = rptToken ? rptToken["access_token"] : null;
                        if (this.rptToken) {
                            return [2 /*return*/, this.updateIntent(body, storyId, intentId, true)];
                        }
                        _a.label = 3;
                    case 3: return [2 /*return*/, api_1.ApiUtils.handleResponse(response)];
                }
            });
        });
    };
    return IntentsService;
}());
exports.IntentsService = IntentsService;
