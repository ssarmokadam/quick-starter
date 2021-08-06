package com.devonfw.exampleapp.general.service.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * TODO snesarmo This type ...
 *
 */
@Path("/test/v1")
public interface TestRestService {

  @GET
  @Path("/hello")
  public String sayHello();

}
