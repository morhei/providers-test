package org.acme.rest.provider;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.StreamingOutput;
import javax.ws.rs.ext.MessageBodyWriter;

import org.apache.commons.io.output.CloseShieldOutputStream;

import com.fasterxml.jackson.databind.ObjectMapper;

@Produces({MediaType.APPLICATION_JSON, "application/*+json"})
public class CustomMessageBodyWriter implements MessageBodyWriter<Object> {

	private final ObjectMapper jsonMapper = configureMapper(new ObjectMapper());

	/**
	 * Configures the mapper. This method can be overridden to add custom
	 * serializers.
	 *
	 * @param mapper the mapper
	 * @return an updated mapper
	 */
	protected ObjectMapper configureMapper(final ObjectMapper mapper) {
		return mapper;
	}

	public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		return !StreamingOutput.class.isAssignableFrom(type);
	}

	public void writeTo(Object t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream)
			throws IOException, WebApplicationException {
		try (var output = CloseShieldOutputStream.wrap(entityStream)) {
			jsonMapper.writer().writeValue(output, t);
			entityStream.write('\n');
		}
	}
}
