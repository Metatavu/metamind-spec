import { ErrorResponse } from '../model/errorResponse';
import { Knot } from '../model/knot';
import * as URI from "urijs";
import { ApiUtils } from "./api";

export class KnotsService {

  private rptToken: string;
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
  public async createKnot(body: Knot, storyId: string,  retrying?: boolean):Promise<Knot> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}/knots`);
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
        return this.createKnot(body,storyId,true);
      }
    }

    return ApiUtils.handleResponse(response);
  }


  /**
   * Delete a knot
   * @summary Delete knot
   * @param storyId story id
   * @param knotId knot id
  */
  public async deleteKnot(storyId: string, knotId: string,  retrying?: boolean):Promise<any> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}/knots/${encodeURIComponent(String(knotId))}`);
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
        return this.deleteKnot(storyId,knotId,true);
      }
    }

    return ApiUtils.handleResponse(response);
  }


  /**
   * Finds a story knot
   * @summary Finds a story knot
   * @param storyId story id
   * @param knotId knot id
  */
  public async findKnot(storyId: string, knotId: string,  retrying?: boolean):Promise<Knot> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}/knots/${encodeURIComponent(String(knotId))}`);
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
        return this.findKnot(storyId,knotId,true);
      }
    }

    return ApiUtils.handleResponse(response);
  }


  /**
   * List story knots
   * @summary List story knots
   * @param storyId story id
  */
  public async listKnots(storyId: string,  retrying?: boolean):Promise<Array<Knot>> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}/knots`);
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
        return this.listKnots(storyId,true);
      }
    }

    return ApiUtils.handleResponse(response);
  }


  /**
   * Updates a knot
   * @summary Updates knot
   * @param body Payload
   * @param storyId story id
   * @param knotId knot id
  */
  public async updateKnot(body: Knot, storyId: string, knotId: string,  retrying?: boolean):Promise<Knot> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}/knots/${encodeURIComponent(String(knotId))}`);
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
        return this.updateKnot(body,storyId,knotId,true);
      }
    }

    return ApiUtils.handleResponse(response);
  }

}