import { ErrorResponse } from '../model/errorResponse';
import { Intent } from '../model/intent';
import * as URI from "urijs";
import { ApiUtils } from "./api";

export class IntentsService {

  private token: string;
  private basePath: string;

  constructor(basePath: string, token: string) {
    this.token = token;
    this.basePath = basePath;
  }


  /**
   * Create story intent
   * @summary Create a story intent
   * @param body Payload
   * @param storyId story id
  */
  public createIntent(body: Intent, storyId: string, ):Promise<Intent> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}/intents`);
    const options = {
      method: "post",
      headers: {
        "Content-Type": "application/json",
        "Authorization": `Bearer ${this.token}`
      },
      body: JSON.stringify(body)
    };

    return fetch(uri.toString(), options).then((response) => {
      return ApiUtils.handleResponse(response);
    });
  }


  /**
   * Delete a intent
   * @summary Delete intent
   * @param storyId story id
   * @param intentId intent id
  */
  public deleteIntent(storyId: string, intentId: string, ):Promise<any> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}/intents/${encodeURIComponent(String(intentId))}`);
    const options = {
      method: "delete",
      headers: {
        "Content-Type": "application/json",
        "Authorization": `Bearer ${this.token}`
      }
    };

    return fetch(uri.toString(), options).then((response) => {
      return ApiUtils.handleResponse(response);
    });
  }


  /**
   * Finds a story intent
   * @summary Finds a story intent
   * @param storyId story id
   * @param intentId intent id
  */
  public findIntent(storyId: string, intentId: string, ):Promise<Intent> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}/intents/${encodeURIComponent(String(intentId))}`);
    const options = {
      method: "get",
      headers: {
        "Content-Type": "application/json",
        "Authorization": `Bearer ${this.token}`
      }
    };

    return fetch(uri.toString(), options).then((response) => {
      return ApiUtils.handleResponse(response);
    });
  }


  /**
   * List story intents
   * @summary List story intents
   * @param storyId story id
  */
  public listIntents(storyId: string, ):Promise<Array<Intent>> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}/intents`);
    const options = {
      method: "get",
      headers: {
        "Content-Type": "application/json",
        "Authorization": `Bearer ${this.token}`
      }
    };

    return fetch(uri.toString(), options).then((response) => {
      return ApiUtils.handleResponse(response);
    });
  }


  /**
   * Updates a intent
   * @summary Updates intent
   * @param body Payload
   * @param storyId story id
   * @param intentId intent id
  */
  public updateIntent(body: Intent, storyId: string, intentId: string, ):Promise<Intent> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}/intents/${encodeURIComponent(String(intentId))}`);
    const options = {
      method: "put",
      headers: {
        "Content-Type": "application/json",
        "Authorization": `Bearer ${this.token}`
      },
      body: JSON.stringify(body)
    };

    return fetch(uri.toString(), options).then((response) => {
      return ApiUtils.handleResponse(response);
    });
  }

}