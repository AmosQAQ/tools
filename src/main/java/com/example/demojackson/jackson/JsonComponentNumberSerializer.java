package com.example.demojackson.jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;

//@JsonComponent
@JacksonStdImpl
public class JsonComponentNumberSerializer extends JsonSerializer<Number> {

    public final static JsonComponentNumberSerializer instance = new JsonComponentNumberSerializer();

    @Override
    public void serialize(Number value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeString(value.toString());

    }
}
