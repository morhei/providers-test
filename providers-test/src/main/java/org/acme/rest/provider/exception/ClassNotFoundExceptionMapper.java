package org.acme.rest.provider.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ClassNotFoundExceptionMapper implements ExceptionMapper<ClassNotFoundException> {
    @Override
    public Response toResponse(final ClassNotFoundException exception) {
        return Response.serverError().build();
    }
}
