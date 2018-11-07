package fi.metatavu.metamind.server.rest;

import fi.metatavu.metamind.server.rest.model.BadRequest;
import fi.metatavu.metamind.server.rest.model.Forbidden;
import fi.metatavu.metamind.server.rest.model.InternalServerError;
import fi.metatavu.metamind.server.rest.model.Script;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/scripts")
@Api(description = "the scripts API")
@Consumes({ "application/json;charset=utf-8" })
@Produces({ "application/json;charset=utf-8" })
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2018-11-07T07:41:54.091+02:00")
public interface ScriptsApi {

    @POST
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Posts new script", notes = "Posts new script", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Scripts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns created a script", response = Script.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    Response createScript(@Valid Script body);
}
