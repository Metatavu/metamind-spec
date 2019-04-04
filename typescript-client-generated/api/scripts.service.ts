import { ErrorResponse } from '../model/errorResponse';
import { Script } from '../model/script';
import * as URI from "urijs";
import { ApiUtils } from "./api";

export class ScriptsService {

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
  public createScript(body: Script, ):Promise<Script> {
    const uri = new URI(`${this.basePath}/scripts`);
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
   * Delete a script
   * @summary Delete script
   * @param scriptId script id
  */
  public deleteScript(scriptId: string, ):Promise<any> {
    const uri = new URI(`${this.basePath}/scripts/${encodeURIComponent(String(scriptId))}`);
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
   * Finds a script
   * @summary Finds a script
   * @param scriptId script id
  */
  public findScript(scriptId: string, ):Promise<Script> {
    const uri = new URI(`${this.basePath}/scripts/${encodeURIComponent(String(scriptId))}`);
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
   * List scripts
   * @summary List scripts
  */
  public listScripts():Promise<Array<Script>> {
    const uri = new URI(`${this.basePath}/scripts`);
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
   * Updates a script
   * @summary Updates script
   * @param body Payload
   * @param scriptId script id
  */
  public updateScript(body: Script, scriptId: string, ):Promise<Script> {
    const uri = new URI(`${this.basePath}/scripts/${encodeURIComponent(String(scriptId))}`);
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