package org.acme.generic;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Path;

@Path("generic/impl")
@ApplicationScoped
class TestImpl implements TestApi {

	@Override
	public GenericFunction<String> subResource() {
		return () -> "generic";
	}
}
