package org.acme.rest.provider.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class NumberFormatExceptionMapper implements ExceptionMapper<NumberFormatException> {
    @Override
    public Response toResponse(final NumberFormatException exception) {
        return Response.serverError().build();
    }
}
