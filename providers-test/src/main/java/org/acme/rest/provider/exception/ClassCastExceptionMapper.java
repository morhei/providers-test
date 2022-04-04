package org.acme.rest.provider.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ClassCastExceptionMapper implements ExceptionMapper<ClassCastException> {
    @Override
    public Response toResponse(final ClassCastException exception) {
        return Response.serverError().build();
    }
}
