package org.acme.rest.json;

import javax.ws.rs.ext.Provider;

import org.acme.rest.provider.CustomMessageBodyWriter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

@Provider
public class GenericJsonSerializer extends CustomMessageBodyWriter {

	@Override
	protected ObjectMapper configureMapper(ObjectMapper mapper) {
		SimpleModule module = new SimpleModule("Test");
		module.addSerializer(Fruit.class, new FruitSerializer());
		mapper.registerModule(module);

		return mapper;
	}
}
