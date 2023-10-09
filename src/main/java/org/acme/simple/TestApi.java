package org.acme.simple;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "http://localhost:8080/simple/impl")
interface TestApi {

	interface SimpleFunction {

		@GET
		@Produces("text/plain;charset=UTF-8")
		String get();
	}

	@Path("")
	SimpleFunction subResource();
}
