package org.acme.rest.provider.exception;

import java.io.IOException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class IOExceptionMapper implements ExceptionMapper<IOException> {
    @Override
    public Response toResponse(final IOException exception) {
    	return Response.serverError().build();
    }
}
