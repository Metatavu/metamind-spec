import { TrainingMaterial } from '../model/trainingMaterial';
import { TrainingMaterialType } from '../model/trainingMaterialType';
import { TrainingMaterialVisibility } from '../model/trainingMaterialVisibility';
export declare class TrainingMaterialsService {
    private rptToken;
    private token;
    private basePath;
    constructor(basePath: string, token: string);
    /**
     * Create training material
     * @summary Create a trainingMaterial
     * @param body Payload
    */
    createTrainingMaterial(body: TrainingMaterial, retrying?: boolean): Promise<TrainingMaterial>;
    /**
     * Delete a training material
     * @summary Delete trainingMaterial
     * @param trainingMaterialId trainingMaterial id
    */
    deleteTrainingMaterial(trainingMaterialId: string, retrying?: boolean): Promise<any>;
    /**
     * Finds a training material
     * @summary Finds a trainingMaterial
     * @param trainingMaterialId trainingMaterial id
    */
    findTrainingMaterial(trainingMaterialId: string, retrying?: boolean): Promise<TrainingMaterial>;
    /**
     * List training materials
     * @summary List trainingMaterials
     * @param storyId story id
     * @param type training material type
     * @param visibility training material visibility
    */
    listTrainingMaterials(storyId?: string, type?: TrainingMaterialType, visibility?: TrainingMaterialVisibility, retrying?: boolean): Promise<Array<TrainingMaterial>>;
    /**
     * Updates a training material
     * @summary Updates trainingMaterial
     * @param body Payload
     * @param trainingMaterialId trainingMaterial id
    */
    updateTrainingMaterial(body: TrainingMaterial, trainingMaterialId: string, retrying?: boolean): Promise<TrainingMaterial>;
}
