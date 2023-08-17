package de.flammenfuchs.thebus.telemetryapi;

import de.flammenfuchs.thebus.telemetryapi.impl.DefaultTelemetryApi;

public class TelemetryApiContainer {
    private static TelemetryApi instance;

    public static void setApi(TelemetryApi instance) {
        TelemetryApiContainer.instance = instance;
    }

    public static TelemetryApi getApi() {
        if (instance == null) {
            instance = new DefaultTelemetryApi();
        }
        return instance;
    }
}
