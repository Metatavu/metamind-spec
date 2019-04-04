import { ErrorResponse } from '../model/errorResponse';
import { Message } from '../model/message';
import * as URI from "urijs";
import { ApiUtils } from "./api";

export class MessagesService {

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
  public createMessage(body: Message, storyId: string, ):Promise<Message> {
    const uri = new URI(`${this.basePath}/stories/${encodeURIComponent(String(storyId))}/messages`);
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