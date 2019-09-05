import { Session } from '../model/session';
export declare class SessionsService {
    private rptToken;
    private token;
    private basePath;
    constructor(basePath: string, token: string);
    /**
     * Creates new chat session
     * @summary Creates new session
     * @param body Payload
     * @param storyId story id
    */
    createSession(body: Session, storyId: string, retrying?: boolean): Promise<Session>;
}
