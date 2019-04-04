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

export class ApiUtils {
  /**
   * Handles response from API
   * 
   * @param response response object
   */
  public static handleResponse(response: any) {
    switch (response.status) {
      case 204:
        return {};
      default:
        return response.json();
    }
  }
}

export default new class Api {

  private apiUrl = "http://localhost";

  /**
   * Configures api endpoint
   *
   */
  public configure(baseUrl: string) {
    this.apiUrl = baseUrl;
  }

  
  public getIntentsService(token: string): IntentsService {
    return new IntentsService(this.apiUrl, token);
  }
  
  public getKnotsService(token: string): KnotsService {
    return new KnotsService(this.apiUrl, token);
  }
  
  public getMessagesService(token: string): MessagesService {
    return new MessagesService(this.apiUrl, token);
  }
  
  public getScriptsService(token: string): ScriptsService {
    return new ScriptsService(this.apiUrl, token);
  }
  
  public getSessionsService(token: string): SessionsService {
    return new SessionsService(this.apiUrl, token);
  }
  
  public getStoriesService(token: string): StoriesService {
    return new StoriesService(this.apiUrl, token);
  }
  
  public getTrainingMaterialsService(token: string): TrainingMaterialsService {
    return new TrainingMaterialsService(this.apiUrl, token);
  }
  
  public getVariablesService(token: string): VariablesService {
    return new VariablesService(this.apiUrl, token);
  }
  
}
