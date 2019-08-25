import { ErrorResponse } from '../model/errorResponse';
import { Session } from '../model/session';
import * as URI from "urijs";
import { ApiUtils } from "./api";

export class SessionsService {

  private rptToken: string;
  private token: string;
  private basePath: string;

  constructor(basePath: string, token: string) {
    this.token = token;
    this.basePath = basePath;
  }


  /**
   * Creates new chat session
   * @summary Creates new session
   * @param body Payload
   * @param storyId story id
  */
  public async createSession(body: Session, storyId: string,  retrying?: boolean):Promise<Session> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}/sessions`);
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
        return this.createSession(body,storyId,true);
      }
    }

    return ApiUtils.handleResponse(response);
  }

}