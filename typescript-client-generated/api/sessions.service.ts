import { ErrorResponse } from '../model/errorResponse';
import { Session } from '../model/session';
import * as URI from "urijs";
import { ApiUtils } from "./api";

export class SessionsService {

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
  public createSession(body: Session, storyId: string, ):Promise<Session> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}/sessions`);
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

}