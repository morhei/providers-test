package org.acme.rest.provider.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class IllegalCallerExceptionMapper implements ExceptionMapper<IllegalCallerException> {
    @Override
    public Response toResponse(final IllegalCallerException exception) {
    	return Response.serverError().build();
    }
}
