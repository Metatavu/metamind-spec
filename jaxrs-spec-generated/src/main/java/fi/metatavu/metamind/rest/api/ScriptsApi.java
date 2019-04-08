package fi.metatavu.metamind.rest.api;

import java.util.UUID;
import fi.metatavu.metamind.rest.model.*;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.io.File;

import java.time.OffsetDateTime;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/scripts")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2019-04-08T13:27:48.892+03:00[Europe/Helsinki]")
public interface ScriptsApi {

    @POST
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Create a script", description = "Create script", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={ "Scripts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Created script", content = @Content(schema = @Schema(implementation = Script.class))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response createScript(@Valid Script body);
    @DELETE
    @Path("/{scriptId}")
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Delete script", description = "Delete a script", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={ "Scripts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Successful removal"),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response deleteScript( @PathParam("scriptId")

 @Parameter(description = "script id") UUID scriptId
);
    @GET
    @Path("/{scriptId}")
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Finds a script", description = "Finds a script", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={ "Scripts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Found script", content = @Content(schema = @Schema(implementation = Script.class))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response findScript( @PathParam("scriptId")

 @Parameter(description = "script id") UUID scriptId
);
    @GET
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "List scripts", description = "List scripts", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={ "Scripts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Scripts", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Script.class)))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response listScripts();
    @PUT
    @Path("/{scriptId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Updates script", description = "Updates a script", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={ "Scripts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Updated script", content = @Content(schema = @Schema(implementation = Script.class))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response updateScript(@Valid Script body, @PathParam("scriptId")

 @Parameter(description = "script id") UUID scriptId
);}
