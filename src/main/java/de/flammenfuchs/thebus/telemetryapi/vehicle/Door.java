package de.flammenfuchs.thebus.telemetryapi.vehicle;

public interface Door {

    String getName();

    boolean isOpen();

    float getProgress();

    boolean isStopRequest();

}
