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
import { MessageResponseType } from './messageResponseType';


export interface MessageResponse { 
    type: MessageResponseType;
    content: string;
}
export interface MessageResponseOpt { 
    type?: MessageResponseType;
    content?: string;
}
