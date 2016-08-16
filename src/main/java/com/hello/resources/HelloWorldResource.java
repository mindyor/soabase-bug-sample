package com.hello.resources;

import com.google.inject.Inject;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/hello-world")
public class HelloWorldResource {
    @Inject
    public HelloWorldResource() {}

    @GET
    public Response post() {
        return Response.ok().build();
    }
}
