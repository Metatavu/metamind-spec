import { ErrorResponse } from '../model/errorResponse';
import { TrainingMaterial } from '../model/trainingMaterial';
import * as URI from "urijs";
import { ApiUtils } from "./api";

export class TrainingMaterialsService {

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
  public createTrainingMaterial(body: TrainingMaterial, ):Promise<TrainingMaterial> {
    const uri = new URI(`${this.basePath}/trainingMaterials`);
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
   * Delete a training material
   * @summary Delete trainingMaterial
   * @param trainingMaterialId trainingMaterial id
  */
  public deleteTrainingMaterial(trainingMaterialId: string, ):Promise<any> {
    const uri = new URI(`${this.basePath}/trainingMaterials/${encodeURIComponent(String(trainingMaterialId))}`);
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
   * Finds a training material
   * @summary Finds a trainingMaterial
   * @param trainingMaterialId trainingMaterial id
  */
  public findTrainingMaterial(trainingMaterialId: string, ):Promise<TrainingMaterial> {
    const uri = new URI(`${this.basePath}/trainingMaterials/${encodeURIComponent(String(trainingMaterialId))}`);
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
   * List training materials
   * @summary List trainingMaterials
   * @param storyId story id
  */
  public listTrainingMaterials(storyId?: string, ):Promise<Array<TrainingMaterial>> {
    const uri = new URI(`${this.basePath}/trainingMaterials`);
    if (storyId !== undefined && storyId !== null) {
        uri.addQuery('storyId', <any>storyId);
    }
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
   * Updates a training material
   * @summary Updates trainingMaterial
   * @param body Payload
   * @param trainingMaterialId trainingMaterial id
  */
  public updateTrainingMaterial(body: TrainingMaterial, trainingMaterialId: string, ):Promise<TrainingMaterial> {
    const uri = new URI(`${this.basePath}/trainingMaterials/${encodeURIComponent(String(trainingMaterialId))}`);
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