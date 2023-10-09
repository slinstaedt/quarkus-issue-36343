package org.acme.simple;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Path;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("simple/client")
@ApplicationScoped
class TestClient implements TestApi {

	@Inject
	@RestClient
	private TestApi delegate;

	@Override
	public SimpleFunction subResource() {
		return () -> delegate.subResource().get() + "-client";
	}
}
