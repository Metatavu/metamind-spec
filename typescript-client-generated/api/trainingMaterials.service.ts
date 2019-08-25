import { ErrorResponse } from '../model/errorResponse';
import { TrainingMaterial } from '../model/trainingMaterial';
import { TrainingMaterialType } from '../model/trainingMaterialType';
import { TrainingMaterialVisibility } from '../model/trainingMaterialVisibility';
import * as URI from "urijs";
import { ApiUtils } from "./api";

export class TrainingMaterialsService {

  private rptToken: string;
  private token: string;
  private basePath: string;

  constructor(basePath: string, token: string) {
    this.token = token;
    this.basePath = basePath;
  }


  /**
   * Create training material
   * @summary Create a trainingMaterial
   * @param body Payload
  */
  public async createTrainingMaterial(body: TrainingMaterial,  retrying?: boolean):Promise<TrainingMaterial> {
    const uri = new URI(`${this.basePath}/trainingMaterials`);
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
        return this.createTrainingMaterial(body,true);
      }
    }

    return ApiUtils.handleResponse(response);
  }


  /**
   * Delete a training material
   * @summary Delete trainingMaterial
   * @param trainingMaterialId trainingMaterial id
  */
  public async deleteTrainingMaterial(trainingMaterialId: string,  retrying?: boolean):Promise<any> {
    const uri = new URI(`${this.basePath}/trainingMaterials/${encodeURIComponent(String(trainingMaterialId))}`);
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
        return this.deleteTrainingMaterial(trainingMaterialId,true);
      }
    }

    return ApiUtils.handleResponse(response);
  }


  /**
   * Finds a training material
   * @summary Finds a trainingMaterial
   * @param trainingMaterialId trainingMaterial id
  */
  public async findTrainingMaterial(trainingMaterialId: string,  retrying?: boolean):Promise<TrainingMaterial> {
    const uri = new URI(`${this.basePath}/trainingMaterials/${encodeURIComponent(String(trainingMaterialId))}`);
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
        return this.findTrainingMaterial(trainingMaterialId,true);
      }
    }

    return ApiUtils.handleResponse(response);
  }


  /**
   * List training materials
   * @summary List trainingMaterials
   * @param storyId story id
   * @param type training material type
   * @param visibility training material visibility
  */
  public async listTrainingMaterials(storyId?: string, type?: TrainingMaterialType, visibility?: TrainingMaterialVisibility,  retrying?: boolean):Promise<Array<TrainingMaterial>> {
    const uri = new URI(`${this.basePath}/trainingMaterials`);
    if (storyId !== undefined && storyId !== null) {
        uri.addQuery('storyId', <any>storyId);
    }
    if (type !== undefined && type !== null) {
        uri.addQuery('type', <any>type);
    }
    if (visibility !== undefined && visibility !== null) {
        uri.addQuery('visibility', <any>visibility);
    }
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
        return this.listTrainingMaterials(storyId,type,visibility,true);
      }
    }

    return ApiUtils.handleResponse(response);
  }


  /**
   * Updates a training material
   * @summary Updates trainingMaterial
   * @param body Payload
   * @param trainingMaterialId trainingMaterial id
  */
  public async updateTrainingMaterial(body: TrainingMaterial, trainingMaterialId: string,  retrying?: boolean):Promise<TrainingMaterial> {
    const uri = new URI(`${this.basePath}/trainingMaterials/${encodeURIComponent(String(trainingMaterialId))}`);
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
        return this.updateTrainingMaterial(body,trainingMaterialId,true);
      }
    }

    return ApiUtils.handleResponse(response);
  }

}