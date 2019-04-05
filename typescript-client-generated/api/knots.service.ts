import { ErrorResponse } from '../model/errorResponse';
import { Knot } from '../model/knot';
import * as URI from "urijs";
import { ApiUtils } from "./api";

export class KnotsService {

  private token: string;
  private basePath: string;

  constructor(basePath: string, token: string) {
    this.token = token;
    this.basePath = basePath;
  }


  /**
   * Create story knot
   * @summary Create a story knot
   * @param body Payload
   * @param storyId story id
  */
  public createKnot(body: Knot, storyId: string, ):Promise<Knot> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}/knots`);
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
   * Delete a knot
   * @summary Delete knot
   * @param storyId story id
   * @param knotId knot id
  */
  public deleteKnot(storyId: string, knotId: string, ):Promise<any> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}/knots/${encodeURIComponent(String(knotId))}`);
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
   * Finds a story knot
   * @summary Finds a story knot
   * @param storyId story id
   * @param knotId knot id
  */
  public findKnot(storyId: string, knotId: string, ):Promise<Knot> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}/knots/${encodeURIComponent(String(knotId))}`);
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
   * List story knots
   * @summary List story knots
   * @param storyId story id
  */
  public listKnots(storyId: string, ):Promise<Array<Knot>> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}/knots`);
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
   * Updates a knot
   * @summary Updates knot
   * @param body Payload
   * @param storyId story id
   * @param knotId knot id
  */
  public updateKnot(body: Knot, storyId: string, knotId: string, ):Promise<Knot> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}/knots/${encodeURIComponent(String(knotId))}`);
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