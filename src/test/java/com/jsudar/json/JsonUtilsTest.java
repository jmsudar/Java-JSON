package com.jsudar.java.json;

import java.util.HashMap;
import java.util.Map;
import javax.json.Json;
import javax.json.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestHelloTest {
	
	@Test
	void testSeralizeJson() {
		Map<String, String> actualObject = new HashMap<>();
                actualObject.put("Hello", "World!");
		actualObject.put("Foo", "Bar");
		
		String actualJson = JsonUtils.serializeToJson(actualObject);

		String expectedJson = "{\"Hello\":\"World!\",\"Foo\":\"Bar\"}";

		assertEquals(expectedJson, actualJson);
	}

	@Test
        void testDeseralizeJson() {
		Map<String, String> expectedObject = new HashMap<>();
                expectedObject.put("Hello", "World!");
                expectedObject.put("Foo", "Bar");

		String actualJson = "{\"Hello\":\"World!\",\"Foo\":\"Bar\"}";
		var actualObject = JsonUtils.deserializeFromJson(actualJson, HashMap.class);

		assertEquals(expectedObject, actualObject);
        }
	
}
