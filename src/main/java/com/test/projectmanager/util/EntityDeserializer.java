package com.test.projectmanager.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.test.projectmanager.entity.Employee;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

public class EntityDeserializer extends StdDeserializer<List<Employee>> {

    public EntityDeserializer() {
        this(null);
    }

    public EntityDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public List<Employee> deserialize(
            JsonParser jsonparser,
            DeserializationContext context)
            throws IOException, JsonProcessingException {

        return new ArrayList<>();
    }
}