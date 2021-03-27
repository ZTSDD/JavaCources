package com.vventerprise.Task3;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import com.fasterxml.jackson.databind.ObjectMapper;

public class OrderSerializer {
    public String serialize(Order order) throws IOException {
        StringWriter writer = new StringWriter();
        ObjectMapper mapper = new ObjectMapper();
        mapper.writer().writeValue(writer, order);
        return writer.toString();
    }

    public Order deserialize(String serializedData) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Order order = mapper.readValue(serializedData, Order.class);
        return order;
    }
}
