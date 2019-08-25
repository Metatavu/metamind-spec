import { ErrorResponse } from '../model/errorResponse';
import { Story } from '../model/story';
import * as URI from "urijs";
import { ApiUtils } from "./api";

export class StoriesService {

  private rptToken: string;
  private token: string;
  private basePath: string;

  constructor(basePath: string, token: string) {
    this.token = token;
    this.basePath = basePath;
  }


  /**
   * Create story
   * @summary Create a story
   * @param body Payload
  */
  public async createStory(body: Story,  retrying?: boolean):Promise<Story> {
    const uri = new URI(`${this.basePath}/stories`);
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
        return this.createStory(body,true);
      }
    }

    return ApiUtils.handleResponse(response);
  }


  /**
   * Delete a story
   * @summary Delete story
   * @param storyId story id
  */
  public async deleteStory(storyId: string,  retrying?: boolean):Promise<any> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}`);
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
        return this.deleteStory(storyId,true);
      }
    }

    return ApiUtils.handleResponse(response);
  }


  /**
   * Finds a story
   * @summary Finds a story
   * @param storyId story id
  */
  public async findStory(storyId: string,  retrying?: boolean):Promise<Story> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}`);
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
        return this.findStory(storyId,true);
      }
    }

    return ApiUtils.handleResponse(response);
  }


  /**
   * List stories
   * @summary List stories
  */
  public async listStories( retrying?: boolean):Promise<Array<Story>> {
    const uri = new URI(`${this.basePath}/stories`);
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
        return this.listStories(true);
      }
    }

    return ApiUtils.handleResponse(response);
  }


  /**
   * Updates a story
   * @summary Updates story
   * @param body Payload
   * @param storyId story id
  */
  public async updateStory(body: Story, storyId: string,  retrying?: boolean):Promise<Story> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}`);
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
        return this.updateStory(body,storyId,true);
      }
    }

    return ApiUtils.handleResponse(response);
  }

}