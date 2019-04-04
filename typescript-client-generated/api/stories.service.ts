import { ErrorResponse } from '../model/errorResponse';
import { Story } from '../model/story';
import * as URI from "urijs";
import { ApiUtils } from "./api";

export class StoriesService {

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
  public createStory(body: Story, ):Promise<Story> {
    const uri = new URI(`${this.basePath}/stories`);
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
   * Delete a story
   * @summary Delete story
   * @param storyId story id
  */
  public deleteStory(storyId: string, ):Promise<any> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}`);
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
   * Finds a story
   * @summary Finds a story
   * @param storyId story id
  */
  public findStory(storyId: string, ):Promise<Story> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}`);
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
   * List stories
   * @summary List stories
  */
  public listStories():Promise<Array<Story>> {
    const uri = new URI(`${this.basePath}/stories`);
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
   * Updates a story
   * @summary Updates story
   * @param body Payload
   * @param storyId story id
  */
  public updateStory(body: Story, storyId: string, ):Promise<Story> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}`);
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