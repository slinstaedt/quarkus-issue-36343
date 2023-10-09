package org.acme.simple;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Path;

@Path("simple/impl")
@ApplicationScoped
class TestImpl implements TestApi {

	@Override
	public SimpleFunction subResource() {
		return () -> "simple";
	}
}
