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

@Path("/trainingMaterials")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2019-04-09T17:11:04.184+03:00[Europe/Helsinki]")
public interface TrainingMaterialsApi {

    @POST
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Create a trainingMaterial", description = "Create training material", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={ "TrainingMaterials" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Created trainingMaterial", content = @Content(schema = @Schema(implementation = TrainingMaterial.class))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response createTrainingMaterial(@Valid TrainingMaterial body);
    @DELETE
    @Path("/{trainingMaterialId}")
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Delete trainingMaterial", description = "Delete a training material", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={ "TrainingMaterials" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Successful removal"),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response deleteTrainingMaterial( @PathParam("trainingMaterialId")

 @Parameter(description = "trainingMaterial id") UUID trainingMaterialId
);
    @GET
    @Path("/{trainingMaterialId}")
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Finds a trainingMaterial", description = "Finds a training material", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={ "TrainingMaterials" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Found trainingMaterial", content = @Content(schema = @Schema(implementation = TrainingMaterial.class))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response findTrainingMaterial( @PathParam("trainingMaterialId")

 @Parameter(description = "trainingMaterial id") UUID trainingMaterialId
);
    @GET
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "List trainingMaterials", description = "List training materials", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={ "TrainingMaterials" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "TrainingMaterials", content = @Content(array = @ArraySchema(schema = @Schema(implementation = TrainingMaterial.class)))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response listTrainingMaterials(  @QueryParam("storyId") 

 @Parameter(description = "story id")  UUID storyId
,  @QueryParam("type") 

 @Parameter(description = "training material type")  TrainingMaterialType type
);
    @PUT
    @Path("/{trainingMaterialId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Updates trainingMaterial", description = "Updates a training material", security = {
        @SecurityRequirement(name = "basicAuth")    }, tags={ "TrainingMaterials" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Updated trainingMaterial", content = @Content(schema = @Schema(implementation = TrainingMaterial.class))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response updateTrainingMaterial(@Valid TrainingMaterial body, @PathParam("trainingMaterialId")

 @Parameter(description = "trainingMaterial id") UUID trainingMaterialId
);}
