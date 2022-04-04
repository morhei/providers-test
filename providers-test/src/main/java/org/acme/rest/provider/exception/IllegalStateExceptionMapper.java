package org.acme.rest.provider.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;


@Provider
public class IllegalStateExceptionMapper implements ExceptionMapper<IllegalStateException> {
    @Override
    public Response toResponse(final IllegalStateException exception) {
        return Response.status(Status.BAD_REQUEST).entity(exception.getMessage() + "\n")
            .type("text/plain;charset=UTF-8")
            .header("x-exception", exception.getClass().getName()).build();
    }
}
