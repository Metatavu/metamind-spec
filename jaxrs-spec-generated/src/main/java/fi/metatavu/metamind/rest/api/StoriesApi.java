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

@Path("/stories")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2020-02-10T13:53:23.035+02:00[Europe/Helsinki]")
public interface StoriesApi {

    @POST
    @Path("/{storyId}/intents")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Create a story intent", description = "Create story intent", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "Intents" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Created story intent", content = @Content(schema = @Schema(implementation = Intent.class))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response createIntent(@Valid Intent body, @PathParam("storyId")

 @Parameter(description = "story id") UUID storyId
);
    @POST
    @Path("/{storyId}/knots")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Create a story knot", description = "Create story knot", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "Knots" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Created story knot", content = @Content(schema = @Schema(implementation = Knot.class))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response createKnot(@Valid Knot body, @PathParam("storyId")

 @Parameter(description = "story id") UUID storyId
);
    @POST
    @Path("/{storyId}/messages")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Posts new message", description = "Posts new message", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "Messages" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Returns message with bot's response details", content = @Content(schema = @Schema(implementation = Message.class))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response createMessage(@Valid Message body, @PathParam("storyId")

 @Parameter(description = "story id") UUID storyId
);
    @POST
    @Path("/{storyId}/sessions")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Creates new session", description = "Creates new chat session", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "Sessions" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Created session", content = @Content(schema = @Schema(implementation = Session.class))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response createSession(@Valid Session body, @PathParam("storyId")

 @Parameter(description = "story id") UUID storyId
);
    @POST
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Create a story", description = "Create story", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "Stories" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Created story", content = @Content(schema = @Schema(implementation = Story.class))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response createStory(@Valid Story body);
    @POST
    @Path("/{storyId}/variables")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Create a story variable", description = "Create story variable", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "Variables" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Created story variable", content = @Content(schema = @Schema(implementation = Variable.class))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response createVariable(@Valid Variable body, @PathParam("storyId")

 @Parameter(description = "story id") UUID storyId
);
    @DELETE
    @Path("/{storyId}/intents/{intentId}")
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Delete intent", description = "Delete a intent", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "Intents" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Successful removal"),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response deleteIntent( @PathParam("storyId")

 @Parameter(description = "story id") UUID storyId
, @PathParam("intentId")

 @Parameter(description = "intent id") UUID intentId
);
    @DELETE
    @Path("/{storyId}/knots/{knotId}")
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Delete knot", description = "Delete a knot", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "Knots" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Successful removal"),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response deleteKnot( @PathParam("storyId")

 @Parameter(description = "story id") UUID storyId
, @PathParam("knotId")

 @Parameter(description = "knot id") UUID knotId
);
    @DELETE
    @Path("/{storyId}")
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Delete story", description = "Delete a story", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "Stories" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Successful removal"),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response deleteStory( @PathParam("storyId")

 @Parameter(description = "story id") UUID storyId
);
    @DELETE
    @Path("/{storyId}/variables/{variableId}")
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Delete variable", description = "Delete a variable", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "Variables" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Successful removal"),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response deleteVariable( @PathParam("storyId")

 @Parameter(description = "story id") UUID storyId
, @PathParam("variableId")

 @Parameter(description = "variable id") UUID variableId
);
    @GET
    @Path("/{storyId}/intents/{intentId}")
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Finds a story intent", description = "Finds a story intent", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "Intents" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Found story intent", content = @Content(schema = @Schema(implementation = Intent.class))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response findIntent( @PathParam("storyId")

 @Parameter(description = "story id") UUID storyId
, @PathParam("intentId")

 @Parameter(description = "intent id") UUID intentId
);
    @GET
    @Path("/{storyId}/knots/{knotId}")
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Finds a story knot", description = "Finds a story knot", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "Knots" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Found story knot", content = @Content(schema = @Schema(implementation = Knot.class))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response findKnot( @PathParam("storyId")

 @Parameter(description = "story id") UUID storyId
, @PathParam("knotId")

 @Parameter(description = "knot id") UUID knotId
);
    @GET
    @Path("/{storyId}")
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Finds a story", description = "Finds a story", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "Stories" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Found story", content = @Content(schema = @Schema(implementation = Story.class))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response findStory( @PathParam("storyId")

 @Parameter(description = "story id") UUID storyId
);
    @GET
    @Path("/{storyId}/variables/{variableId}")
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Finds a story variable", description = "Finds a story variable", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "Variables" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Found story variable", content = @Content(schema = @Schema(implementation = Variable.class))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response findVariable( @PathParam("storyId")

 @Parameter(description = "story id") UUID storyId
, @PathParam("variableId")

 @Parameter(description = "variable id") UUID variableId
);
    @GET
    @Path("/{storyId}/intents")
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "List story intents", description = "List story intents", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "Intents" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Story intents", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Intent.class)))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response listIntents( @PathParam("storyId")

 @Parameter(description = "story id") UUID storyId
);
    @GET
    @Path("/{storyId}/knots")
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "List story knots", description = "List story knots", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "Knots" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Story knots", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Knot.class)))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response listKnots( @PathParam("storyId")

 @Parameter(description = "story id") UUID storyId
);
    @GET
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "List stories", description = "List stories", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "Stories" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Stories", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Story.class)))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response listStories();
    @GET
    @Path("/{storyId}/variables")
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "List story variables", description = "List story variables", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "Variables" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Story variables", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Variable.class)))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response listVariables( @PathParam("storyId")

 @Parameter(description = "story id") UUID storyId
);
    @PUT
    @Path("/{storyId}/intents/{intentId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Updates intent", description = "Updates a intent", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "Intents" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Updated story intent", content = @Content(schema = @Schema(implementation = Intent.class))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response updateIntent(@Valid Intent body, @PathParam("storyId")

 @Parameter(description = "story id") UUID storyId
, @PathParam("intentId")

 @Parameter(description = "intent id") UUID intentId
);
    @PUT
    @Path("/{storyId}/knots/{knotId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Updates knot", description = "Updates a knot", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "Knots" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Updated story knot", content = @Content(schema = @Schema(implementation = Knot.class))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response updateKnot(@Valid Knot body, @PathParam("storyId")

 @Parameter(description = "story id") UUID storyId
, @PathParam("knotId")

 @Parameter(description = "knot id") UUID knotId
);
    @PUT
    @Path("/{storyId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Updates story", description = "Updates a story", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "Stories" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Updated story", content = @Content(schema = @Schema(implementation = Story.class))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response updateStory(@Valid Story body, @PathParam("storyId")

 @Parameter(description = "story id") UUID storyId
);
    @PUT
    @Path("/{storyId}/variables/{variableId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Updates variable", description = "Updates a variable", security = {
        @SecurityRequirement(name = "BearerAuth")    }, tags={ "Variables" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Updated story variable", content = @Content(schema = @Schema(implementation = Story.class))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    Response updateVariable(@Valid Variable body, @PathParam("storyId")

 @Parameter(description = "story id") UUID storyId
, @PathParam("variableId")

 @Parameter(description = "variable id") UUID variableId
);}
