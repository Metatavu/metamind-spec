export * from './intents.service';
import { IntentsService } from './intents.service';
export * from './knots.service';
import { KnotsService } from './knots.service';
export * from './messages.service';
import { MessagesService } from './messages.service';
export * from './scripts.service';
import { ScriptsService } from './scripts.service';
export * from './sessions.service';
import { SessionsService } from './sessions.service';
export * from './stories.service';
import { StoriesService } from './stories.service';
export * from './trainingMaterials.service';
import { TrainingMaterialsService } from './trainingMaterials.service';
export * from './variables.service';
import { VariablesService } from './variables.service';
export declare class ApiUtils {
    /**
     * Handles response from API
     *
     * @param response response object
     */
    static handleResponse(response: any): any;
}
declare const _default: {
    apiUrl: string;
    /**
     * Configures api endpoint
     *
     */
    configure(baseUrl: string): void;
    getIntentsService(token: string): IntentsService;
    getKnotsService(token: string): KnotsService;
    getMessagesService(token: string): MessagesService;
    getScriptsService(token: string): ScriptsService;
    getSessionsService(token: string): SessionsService;
    getStoriesService(token: string): StoriesService;
    getTrainingMaterialsService(token: string): TrainingMaterialsService;
    getVariablesService(token: string): VariablesService;
};
export default _default;
