package de.flammenfuchs.thebus.telemetryapi.impl.deserializer;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class MapDeserializer<V> implements JsonDeserializer<Map<String, V>> {
    @Override
    public Map<String, V> deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return jsonElement.getAsJsonObject()
                .entrySet()
                .stream()
                .filter(element -> element.getValue().isJsonPrimitive())
                .collect(Collectors.toMap(
                        element -> element.getKey().toLowerCase(),
                        element -> toValue(element.getValue())
                ));
    }

    protected abstract V toValue(JsonElement element);

}
