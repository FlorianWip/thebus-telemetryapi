package de.flammenfuchs.thebus.telemetryapi.impl.deserializer;

import com.google.gson.*;

import java.awt.*;
import java.lang.reflect.Type;

public class ColorDeserializer implements JsonDeserializer<Color> {

    @Override
    public Color deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        String[] raw = jsonElement.getAsString().split(",");
        int r = Integer.parseInt(raw[0]);
        int g = Integer.parseInt(raw[1]);
        int b = Integer.parseInt(raw[2]);
        int a = Integer.parseInt(raw[3]);
        return new Color(r, g, b, a);
    }
}
