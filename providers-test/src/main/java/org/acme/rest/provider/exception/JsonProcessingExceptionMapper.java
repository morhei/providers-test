package org.acme.rest.provider.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.fasterxml.jackson.core.JsonProcessingException;
@Provider
public class JsonProcessingExceptionMapper implements ExceptionMapper<JsonProcessingException> {
    @Override
    public Response toResponse(final JsonProcessingException exception) {
    	return Response.serverError().build();
    }
}
