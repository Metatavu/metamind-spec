import { ErrorResponse } from '../model/errorResponse';
import { Script } from '../model/script';
import * as URI from "urijs";
import { ApiUtils } from "./api";

export class ScriptsService {

  private rptToken: string;
  private token: string;
  private basePath: string;

  constructor(basePath: string, token: string) {
    this.token = token;
    this.basePath = basePath;
  }


  /**
   * Create script
   * @summary Create a script
   * @param body Payload
  */
  public async createScript(body: Script,  retrying?: boolean):Promise<Script> {
    const uri = new URI(`${this.basePath}/scripts`);
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
        return this.createScript(body,true);
      }
    }

    return ApiUtils.handleResponse(response);
  }


  /**
   * Delete a script
   * @summary Delete script
   * @param scriptId script id
  */
  public async deleteScript(scriptId: string,  retrying?: boolean):Promise<any> {
    const uri = new URI(`${this.basePath}/scripts/${encodeURIComponent(String(scriptId))}`);
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
        return this.deleteScript(scriptId,true);
      }
    }

    return ApiUtils.handleResponse(response);
  }


  /**
   * Finds a script
   * @summary Finds a script
   * @param scriptId script id
  */
  public async findScript(scriptId: string,  retrying?: boolean):Promise<Script> {
    const uri = new URI(`${this.basePath}/scripts/${encodeURIComponent(String(scriptId))}`);
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
        return this.findScript(scriptId,true);
      }
    }

    return ApiUtils.handleResponse(response);
  }


  /**
   * List scripts
   * @summary List scripts
  */
  public async listScripts( retrying?: boolean):Promise<Array<Script>> {
    const uri = new URI(`${this.basePath}/scripts`);
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
        return this.listScripts(true);
      }
    }

    return ApiUtils.handleResponse(response);
  }


  /**
   * Updates a script
   * @summary Updates script
   * @param body Payload
   * @param scriptId script id
  */
  public async updateScript(body: Script, scriptId: string,  retrying?: boolean):Promise<Script> {
    const uri = new URI(`${this.basePath}/scripts/${encodeURIComponent(String(scriptId))}`);
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
        return this.updateScript(body,scriptId,true);
      }
    }

    return ApiUtils.handleResponse(response);
  }

}