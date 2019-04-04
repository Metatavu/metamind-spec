import { TrainingMaterial } from '../model/trainingMaterial';
export declare class TrainingMaterialsService {
    private token;
    private basePath;
    constructor(basePath: string, token: string);
    /**
     * Create training material
     * @summary Create a trainingMaterial
     * @param body Payload
    */
    createTrainingMaterial(body: TrainingMaterial): Promise<TrainingMaterial>;
    /**
     * Delete a training material
     * @summary Delete trainingMaterial
     * @param trainingMaterialId trainingMaterial id
    */
    deleteTrainingMaterial(trainingMaterialId: string): Promise<any>;
    /**
     * Finds a training material
     * @summary Finds a trainingMaterial
     * @param trainingMaterialId trainingMaterial id
    */
    findTrainingMaterial(trainingMaterialId: string): Promise<TrainingMaterial>;
    /**
     * List training materials
     * @summary List trainingMaterials
    */
    listTrainingMaterials(): Promise<Array<TrainingMaterial>>;
    /**
     * Updates a training material
     * @summary Updates trainingMaterial
     * @param body Payload
     * @param trainingMaterialId trainingMaterial id
    */
    updateTrainingMaterial(body: TrainingMaterial, trainingMaterialId: string): Promise<TrainingMaterial>;
}
