import { Script } from '../model/script';
export declare class ScriptsService {
    private rptToken;
    private token;
    private basePath;
    constructor(basePath: string, token: string);
    /**
     * Create script
     * @summary Create a script
     * @param body Payload
    */
    createScript(body: Script, retrying?: boolean): Promise<Script>;
    /**
     * Delete a script
     * @summary Delete script
     * @param scriptId script id
    */
    deleteScript(scriptId: string, retrying?: boolean): Promise<any>;
    /**
     * Finds a script
     * @summary Finds a script
     * @param scriptId script id
    */
    findScript(scriptId: string, retrying?: boolean): Promise<Script>;
    /**
     * List scripts
     * @summary List scripts
    */
    listScripts(retrying?: boolean): Promise<Array<Script>>;
    /**
     * Updates a script
     * @summary Updates script
     * @param body Payload
     * @param scriptId script id
    */
    updateScript(body: Script, scriptId: string, retrying?: boolean): Promise<Script>;
}
