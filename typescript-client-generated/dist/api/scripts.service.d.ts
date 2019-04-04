import { Script } from '../model/script';
export declare class ScriptsService {
    private token;
    private basePath;
    constructor(basePath: string, token: string);
    /**
     * Create script
     * @summary Create a script
     * @param body Payload
    */
    createScript(body: Script): Promise<Script>;
    /**
     * Delete a script
     * @summary Delete script
     * @param scriptId script id
    */
    deleteScript(scriptId: string): Promise<any>;
    /**
     * Finds a script
     * @summary Finds a script
     * @param scriptId script id
    */
    findScript(scriptId: string): Promise<Script>;
    /**
     * List scripts
     * @summary List scripts
    */
    listScripts(): Promise<Array<Script>>;
    /**
     * Updates a script
     * @summary Updates script
     * @param body Payload
     * @param scriptId script id
    */
    updateScript(body: Script, scriptId: string): Promise<Script>;
}
