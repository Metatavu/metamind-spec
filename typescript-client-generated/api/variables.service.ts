import { ErrorResponse } from '../model/errorResponse';
import { Story } from '../model/story';
import { Variable } from '../model/variable';
import * as URI from "urijs";
import { ApiUtils } from "./api";

export class VariablesService {

  private rptToken: string;
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
  public async createVariable(body: Variable, storyId: string,  retrying?: boolean):Promise<Variable> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}/variables`);
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
        return this.createVariable(body,storyId,true);
      }
    }

    return ApiUtils.handleResponse(response);
  }


  /**
   * Delete a variable
   * @summary Delete variable
   * @param storyId story id
   * @param variableId variable id
  */
  public async deleteVariable(storyId: string, variableId: string,  retrying?: boolean):Promise<any> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}/variables/${encodeURIComponent(String(variableId))}`);
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
        return this.deleteVariable(storyId,variableId,true);
      }
    }

    return ApiUtils.handleResponse(response);
  }


  /**
   * Finds a story variable
   * @summary Finds a story variable
   * @param storyId story id
   * @param variableId variable id
  */
  public async findVariable(storyId: string, variableId: string,  retrying?: boolean):Promise<Variable> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}/variables/${encodeURIComponent(String(variableId))}`);
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
        return this.findVariable(storyId,variableId,true);
      }
    }

    return ApiUtils.handleResponse(response);
  }


  /**
   * List story variables
   * @summary List story variables
   * @param storyId story id
  */
  public async listVariables(storyId: string,  retrying?: boolean):Promise<Array<Variable>> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}/variables`);
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
        return this.listVariables(storyId,true);
      }
    }

    return ApiUtils.handleResponse(response);
  }


  /**
   * Updates a variable
   * @summary Updates variable
   * @param body Payload
   * @param storyId story id
   * @param variableId variable id
  */
  public async updateVariable(body: Variable, storyId: string, variableId: string,  retrying?: boolean):Promise<Story> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}/variables/${encodeURIComponent(String(variableId))}`);
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
        return this.updateVariable(body,storyId,variableId,true);
      }
    }

    return ApiUtils.handleResponse(response);
  }

}