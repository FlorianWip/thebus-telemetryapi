package de.flammenfuchs.thebus.telemetryapi.impl.http;

public interface HttpFailHandler {

    void onFail(String endpoint, Exception ex);

}
