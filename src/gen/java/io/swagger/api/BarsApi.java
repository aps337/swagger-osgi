package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.BarsApiService;
import io.swagger.api.factories.BarsApiServiceFactory;

import io.swagger.annotations.ApiParam;

import io.swagger.model.Bar;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/bars")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the bars API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-09T14:55:37.598-04:00")
public class BarsApi  {
   private final BarsApiService delegate = BarsApiServiceFactory.getBarsApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all bar objects.", notes = "Gets all bar objects ", response = Bar.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Bar.class) })
    public Response barsGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.barsGet(securityContext);
    }
}
