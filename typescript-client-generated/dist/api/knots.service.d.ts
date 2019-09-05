import { Knot } from '../model/knot';
export declare class KnotsService {
    private rptToken;
    private token;
    private basePath;
    constructor(basePath: string, token: string);
    /**
     * Create story knot
     * @summary Create a story knot
     * @param body Payload
     * @param storyId story id
    */
    createKnot(body: Knot, storyId: string, retrying?: boolean): Promise<Knot>;
    /**
     * Delete a knot
     * @summary Delete knot
     * @param storyId story id
     * @param knotId knot id
    */
    deleteKnot(storyId: string, knotId: string, retrying?: boolean): Promise<any>;
    /**
     * Finds a story knot
     * @summary Finds a story knot
     * @param storyId story id
     * @param knotId knot id
    */
    findKnot(storyId: string, knotId: string, retrying?: boolean): Promise<Knot>;
    /**
     * List story knots
     * @summary List story knots
     * @param storyId story id
    */
    listKnots(storyId: string, retrying?: boolean): Promise<Array<Knot>>;
    /**
     * Updates a knot
     * @summary Updates knot
     * @param body Payload
     * @param storyId story id
     * @param knotId knot id
    */
    updateKnot(body: Knot, storyId: string, knotId: string, retrying?: boolean): Promise<Knot>;
}
