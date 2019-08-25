import { ErrorResponse } from '../model/errorResponse';
import { Message } from '../model/message';
import * as URI from "urijs";
import { ApiUtils } from "./api";

export class MessagesService {

  private rptToken: string;
  private token: string;
  private basePath: string;

  constructor(basePath: string, token: string) {
    this.token = token;
    this.basePath = basePath;
  }


  /**
   * Posts new message
   * @summary Posts new message
   * @param body Payload
   * @param storyId story id
  */
  public async createMessage(body: Message, storyId: string,  retrying?: boolean):Promise<Message> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}/messages`);
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
        return this.createMessage(body,storyId,true);
      }
    }

    return ApiUtils.handleResponse(response);
  }

}