/**
 * Metamind API
 * Brain spec for Metamind.
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
import { IntentTrainingMaterials } from './intentTrainingMaterials';
import { IntentType } from './intentType';


export interface Intent { 
    /**
     * intent id.
     */
    readonly id?: string;
    name?: string;
    quickResponse?: string;
    type: IntentType;
    /**
     * source knot id id.
     */
    sourceKnotId?: string;
    /**
     * target knot id id.
     */
    targetKnotId: string;
    global: boolean;
    trainingMaterials: IntentTrainingMaterials;
    /**
     * Creation time
     */
    readonly createdAt?: Date;
    /**
     * Last modification time
     */
    readonly modifiedAt?: Date;
}
export interface IntentOpt { 
    /**
     * intent id.
     */
    readonly id?: string;
    name?: string;
    quickResponse?: string;
    type?: IntentType;
    /**
     * source knot id id.
     */
    sourceKnotId?: string;
    /**
     * target knot id id.
     */
    targetKnotId?: string;
    global?: boolean;
    trainingMaterials?: IntentTrainingMaterials;
    /**
     * Creation time
     */
    readonly createdAt?: Date;
    /**
     * Last modification time
     */
    readonly modifiedAt?: Date;
}
