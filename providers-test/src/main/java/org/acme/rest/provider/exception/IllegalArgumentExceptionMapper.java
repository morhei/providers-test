package org.acme.rest.provider.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class IllegalArgumentExceptionMapper implements ExceptionMapper<IllegalArgumentException> {
    @Override
    public Response toResponse(final IllegalArgumentException exception) {
    	return Response.serverError().build();
    }
}
