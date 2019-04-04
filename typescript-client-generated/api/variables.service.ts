import { ErrorResponse } from '../model/errorResponse';
import { Story } from '../model/story';
import { Variable } from '../model/variable';
import * as URI from "urijs";
import { ApiUtils } from "./api";

export class VariablesService {

  private token: string;
  private basePath: string;

  constructor(basePath: string, token: string) {
    this.token = token;
    this.basePath = basePath;
  }


  /**
   * Create story variable
   * @summary Create a story variable
   * @param body Payload
   * @param storyId story id
  */
  public createVariable(body: Variable, storyId: string, ):Promise<Variable> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}/variables`);
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
   * Delete a variable
   * @summary Delete variable
   * @param storyId story id
   * @param variableId variable id
  */
  public deleteVariable(storyId: string, variableId: string, ):Promise<any> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}/variables/${encodeURIComponent(String(variableId))}`);
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
   * Finds a story variable
   * @summary Finds a story variable
   * @param storyId story id
   * @param variableId variable id
  */
  public findVariable(storyId: string, variableId: string, ):Promise<Variable> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}/variables/${encodeURIComponent(String(variableId))}`);
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
   * List story variables
   * @summary List story variables
   * @param storyId story id
  */
  public listVariables(storyId: string, ):Promise<Array<Variable>> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}/variables`);
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
   * Updates a variable
   * @summary Updates variable
   * @param body Payload
   * @param storyId story id
   * @param variableId variable id
  */
  public updateVariable(body: Variable, storyId: string, variableId: string, ):Promise<Story> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}/variables/${encodeURIComponent(String(variableId))}`);
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