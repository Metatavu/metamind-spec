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

@Path("/storyExport")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2020-02-10T13:53:23.035+02:00[Europe/Helsinki]")
public interface StoryExportApi {

    @GET
    @Path("/{storyId}")
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Export a story", description = "export story", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "StoryExport" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Exported story", content = @Content(schema = @Schema(implementation = ExportedStory.class))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response exportStory( @PathParam("storyId")

 @Parameter(description = "Id of the story to be exported") UUID storyId
);}
