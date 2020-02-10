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
export * from './storyExport.service';
import { StoryExportService } from './storyExport.service';
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
  public static handleResponse(response: Response): any {
    switch (response.status) {
      case 204:
        return {};
      default:
        return response.json();
    }
  }

  /**
   * Returns UMA ticket from www-authenticate header or null if not found
   * 
   * @param response response from api call
   * 
   * @returns uma ticket or null
   */
  public static getUMATicket(response: Response): any {
    const wwwAuthenticateHeader = response.headers ? response.headers.get("www-authenticate") : null;
    if (!wwwAuthenticateHeader) {
      return null;
    }

    const result: any = {};

    if (wwwAuthenticateHeader.indexOf("UMA ") !== 0) {
      return null;
    }

    const headerComponents = wwwAuthenticateHeader.substring(4).split(",");
    headerComponents.forEach((component) => {
      const eq = component.indexOf("=");
      const name = component.substring(0, eq);
      const value = component.substring(eq + 2, component.length - 1);
      result[name] = value;
    });

    return result;
  }

  /**
   * Returns RPT token using authorization and ticket
   * 
   * @param authorization authorization
   * @param ticket ticket
   * @returns RPT token
   **/
  public static getRPT = async (authorization: string, ticket: any) => {
    const url = `${ticket.as_uri}/protocol/openid-connect/token`;
    const body = new URLSearchParams();
    body.append("grant_type", "urn:ietf:params:oauth:grant-type:uma-ticket");
    body.append("ticket", ticket.ticket);
    body.append("submit_request", "false");

    const headers = {
      "Authorization": authorization,
      "Content-Type": "application/x-www-form-urlencoded"
    };

    return await (await fetch(url, {
      body: body,
      headers: headers
    })).json();
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
  
  public getStoryExportService(token: string): StoryExportService {
    return new StoryExportService(this.apiUrl, token);
  }
  
  public getTrainingMaterialsService(token: string): TrainingMaterialsService {
    return new TrainingMaterialsService(this.apiUrl, token);
  }
  
  public getVariablesService(token: string): VariablesService {
    return new VariablesService(this.apiUrl, token);
  }
  
}
