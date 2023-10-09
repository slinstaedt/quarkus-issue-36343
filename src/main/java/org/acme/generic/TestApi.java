package org.acme.generic;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "http://localhost:8080/generic/impl")
interface TestApi {

	interface GenericFunction<R> {

		@GET
		R get();
	}

	@Path("")
	GenericFunction<String> subResource();
}
