package org.acme.rest.provider.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class NullPointerExceptionMapper implements ExceptionMapper<NullPointerException> {
    @Override
    public Response toResponse(final NullPointerException exception) {
    	return Response.serverError().build();
    }
}
