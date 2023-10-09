package org.acme.simple;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "http://localhost:8080/simple/impl")
interface TestApi {

	interface SimpleFunction {

		@GET
		String get();
	}

	@Path("")
	SimpleFunction subResource();
}
