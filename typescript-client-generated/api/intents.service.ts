import { ErrorResponse } from '../model/errorResponse';
import { Intent } from '../model/intent';
import * as URI from "urijs";
import { ApiUtils } from "./api";

export class IntentsService {

  private rptToken: string;
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
  public async createIntent(body: Intent, storyId: string,  retrying?: boolean):Promise<Intent> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}/intents`);
    const options = {
      method: "post",
      headers: {
        "Content-Type": "application/json",
        "Authorization": `Bearer ${this.rptToken ? this.rptToken : this.token}`
      },
      body: JSON.stringify(body)
    };

    const response = await fetch(uri.toString(), options);

    if (!retrying && response.status == 401) {
      const ticket = ApiUtils.getUMATicket(response);
      const authorization = response.headers.get("Authorization");
      const rptToken = await ApiUtils.getRPT(authorization, ticket);
      this.rptToken = rptToken ? rptToken["access_token"] : null;
      if (this.rptToken) {
        return this.createIntent(body,storyId,true);
      }
    }

    return ApiUtils.handleResponse(response);
  }


  /**
   * Delete a intent
   * @summary Delete intent
   * @param storyId story id
   * @param intentId intent id
  */
  public async deleteIntent(storyId: string, intentId: string,  retrying?: boolean):Promise<any> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}/intents/${encodeURIComponent(String(intentId))}`);
    const options = {
      method: "delete",
      headers: {
        "Content-Type": "application/json",
        "Authorization": `Bearer ${this.rptToken ? this.rptToken : this.token}`
      }
    };

    const response = await fetch(uri.toString(), options);

    if (!retrying && response.status == 401) {
      const ticket = ApiUtils.getUMATicket(response);
      const authorization = response.headers.get("Authorization");
      const rptToken = await ApiUtils.getRPT(authorization, ticket);
      this.rptToken = rptToken ? rptToken["access_token"] : null;
      if (this.rptToken) {
        return this.deleteIntent(storyId,intentId,true);
      }
    }

    return ApiUtils.handleResponse(response);
  }


  /**
   * Finds a story intent
   * @summary Finds a story intent
   * @param storyId story id
   * @param intentId intent id
  */
  public async findIntent(storyId: string, intentId: string,  retrying?: boolean):Promise<Intent> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}/intents/${encodeURIComponent(String(intentId))}`);
    const options = {
      method: "get",
      headers: {
        "Content-Type": "application/json",
        "Authorization": `Bearer ${this.rptToken ? this.rptToken : this.token}`
      }
    };

    const response = await fetch(uri.toString(), options);

    if (!retrying && response.status == 401) {
      const ticket = ApiUtils.getUMATicket(response);
      const authorization = response.headers.get("Authorization");
      const rptToken = await ApiUtils.getRPT(authorization, ticket);
      this.rptToken = rptToken ? rptToken["access_token"] : null;
      if (this.rptToken) {
        return this.findIntent(storyId,intentId,true);
      }
    }

    return ApiUtils.handleResponse(response);
  }


  /**
   * List story intents
   * @summary List story intents
   * @param storyId story id
  */
  public async listIntents(storyId: string,  retrying?: boolean):Promise<Array<Intent>> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}/intents`);
    const options = {
      method: "get",
      headers: {
        "Content-Type": "application/json",
        "Authorization": `Bearer ${this.rptToken ? this.rptToken : this.token}`
      }
    };

    const response = await fetch(uri.toString(), options);

    if (!retrying && response.status == 401) {
      const ticket = ApiUtils.getUMATicket(response);
      const authorization = response.headers.get("Authorization");
      const rptToken = await ApiUtils.getRPT(authorization, ticket);
      this.rptToken = rptToken ? rptToken["access_token"] : null;
      if (this.rptToken) {
        return this.listIntents(storyId,true);
      }
    }

    return ApiUtils.handleResponse(response);
  }


  /**
   * Updates a intent
   * @summary Updates intent
   * @param body Payload
   * @param storyId story id
   * @param intentId intent id
  */
  public async updateIntent(body: Intent, storyId: string, intentId: string,  retrying?: boolean):Promise<Intent> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}/intents/${encodeURIComponent(String(intentId))}`);
    const options = {
      method: "put",
      headers: {
        "Content-Type": "application/json",
        "Authorization": `Bearer ${this.rptToken ? this.rptToken : this.token}`
      },
      body: JSON.stringify(body)
    };

    const response = await fetch(uri.toString(), options);

    if (!retrying && response.status == 401) {
      const ticket = ApiUtils.getUMATicket(response);
      const authorization = response.headers.get("Authorization");
      const rptToken = await ApiUtils.getRPT(authorization, ticket);
      this.rptToken = rptToken ? rptToken["access_token"] : null;
      if (this.rptToken) {
        return this.updateIntent(body,storyId,intentId,true);
      }
    }

    return ApiUtils.handleResponse(response);
  }

}