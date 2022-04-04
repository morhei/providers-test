package org.acme.rest.provider.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class NoClassDefFoundErrorMapper implements ExceptionMapper<NoClassDefFoundError> {
    @Override
    public Response toResponse(final NoClassDefFoundError exception) {
    	return Response.serverError().build();
    }
}
