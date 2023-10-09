package org.acme.generic;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Path;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("generic/client")
@ApplicationScoped
class TestClient implements TestApi {

	@Inject
	@RestClient
	private TestApi delegate;

	@Override
	public GenericFunction<String> subResource() {
		return () -> delegate.subResource().get() + "-client";
	}
}
