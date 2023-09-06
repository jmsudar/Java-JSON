package com.jsudar.java.json;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

/**
 * This class provides utility methods for working with JSON data.
 *
 * @since 1.0
 */
public final class JsonUtils {

	// Private constructor to hide the default public constructor
    	private JsonUtils() {
        	// This constructor intentionally left empty.
    	}

	/**
     	 * The JSONB instance used for JSON serialization and deserialization.
     	 */
	private static final Jsonb JSONB = JsonbBuilder.create();

	/**
	 * deserialize JSON string into generic object.
	 *
	 * @param <T> the return type of the deserialized object
	 * @param json the JSON string being deserialized
	 * @param returnClass the class type you expect on return
	 * @return a deserialized java object
	 */
	public static <T> T deserializeFromJson(
		final String json, final Class<T> returnClass) {
        	return JSONB.fromJson(json, returnClass);
	}

	/**
	 * serialize generic object into JSON string.
	 * @param <T> the type of object to serialize
	 * @param object the object to serialize
	 * @return a JSON string representing the serialized object
	 */
	public static <T> String serializeToJson(final T object) {
		return JSONB.toJson(object);
    	}
}
