package org.acme.rest.provider.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class RuntimeExceptionMapper implements ExceptionMapper<RuntimeException> {
    @Override
    public Response toResponse(final RuntimeException exception) {
    	return Response.serverError().build();
    }
}
