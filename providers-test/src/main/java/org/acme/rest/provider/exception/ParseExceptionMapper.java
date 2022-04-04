package org.acme.rest.provider.exception;

import java.text.ParseException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ParseExceptionMapper implements ExceptionMapper< ParseException> {
    @Override
    public Response toResponse(final  ParseException exception) {
    	return Response.serverError().build();
    }
}
