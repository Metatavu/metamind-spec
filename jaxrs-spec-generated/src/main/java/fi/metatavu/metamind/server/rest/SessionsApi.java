package fi.metatavu.metamind.server.rest;

import fi.metatavu.metamind.server.rest.model.BadRequest;
import fi.metatavu.metamind.server.rest.model.Forbidden;
import fi.metatavu.metamind.server.rest.model.InternalServerError;
import fi.metatavu.metamind.server.rest.model.Session;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
import java.lang.Exception;

@Path("/sessions")

@Api(description = "the sessions API")
@Consumes({ "application/json;charset=utf-8" })
@Produces({ "application/json;charset=utf-8" })
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2017-11-21T00:33:54.629+02:00")


public interface SessionsApi  {

    @POST
    
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Creates new session", notes = "Creates new chat session", response = Session.class, tags={ "Session" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Created session", response = Session.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response createSession(@Valid Session body) throws Exception;
}
