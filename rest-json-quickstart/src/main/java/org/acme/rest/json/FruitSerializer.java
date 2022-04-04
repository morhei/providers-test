package org.acme.rest.json;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class FruitSerializer extends StdSerializer<Fruit> {

	private static final long serialVersionUID = 1L;

	protected FruitSerializer() {
		super(Fruit.class);
	}

	@Override
	public void serialize(Fruit value, JsonGenerator gen, SerializerProvider provider) throws IOException {
		gen.writeStartObject();
		gen.writeStringField("fruitName", value.getName());
		gen.writeStringField("fruitDesc", value.getDescription());
		gen.writeEndObject();
	}

}
