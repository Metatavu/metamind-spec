import { ErrorResponse } from '../model/errorResponse';
import { ExportedStory } from '../model/exportedStory';
import { Story } from '../model/story';
import * as URI from "urijs";
import { ApiUtils } from "./api";

export class StoryExportService {

  private rptToken: string;
  private token: string;
  private basePath: string;

  constructor(basePath: string, token: string) {
    this.token = token;
    this.basePath = basePath;
  }


  /**
   * export story
   * @summary Export a story
   * @param storyId Id of the story to be exported
  */
  public async exportStory(storyId: string,  retrying?: boolean):Promise<ExportedStory> {
    const uri = new URI(`${this.basePath}/storyExport/${encodeURIComponent(String(storyId))}`);
    const options = {
      method: "get",
      headers: {
        "Content-Type": "application/json",
        "Authorization": `Bearer ${this.rptToken ? this.rptToken : this.token}`
      }
    };

    const response = await fetch(uri.toString(), options);

    if (!retrying && response.status == 401) {
      const ticket = ApiUtils.getUMATicket(response);
      const authorization = response.headers.get("Authorization");
      const rptToken = await ApiUtils.getRPT(authorization, ticket);
      this.rptToken = rptToken ? rptToken["access_token"] : null;
      if (this.rptToken) {
        return this.exportStory(storyId,true);
      }
    }

    return ApiUtils.handleResponse(response);
  }


  /**
   * Import story
   * @summary Import a story
   * @param body Payload
  */
  public async importStory(body: ExportedStory,  retrying?: boolean):Promise<Story> {
    const uri = new URI(`${this.basePath}/storyImport/`);
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
        return this.importStory(body,true);
      }
    }

    return ApiUtils.handleResponse(response);
  }

}