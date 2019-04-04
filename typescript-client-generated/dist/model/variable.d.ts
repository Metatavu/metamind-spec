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
import { VariableType } from './variableType';
export interface Variable {
    /**
     * variable id.
     */
    readonly id?: string;
    name: string;
    type: VariableType;
    /**
     * Story id
     */
    storyId: string;
    /**
     * Validation script
     */
    validationScript?: string;
    /**
     * Creation time
     */
    readonly createdAt?: Date;
    /**
     * Last modification time
     */
    readonly modifiedAt?: Date;
}
export interface VariableOpt {
    /**
     * variable id.
     */
    readonly id?: string;
    name?: string;
    type?: VariableType;
    /**
     * Story id
     */
    storyId?: string;
    /**
     * Validation script
     */
    validationScript?: string;
    /**
     * Creation time
     */
    readonly createdAt?: Date;
    /**
     * Last modification time
     */
    readonly modifiedAt?: Date;
}
