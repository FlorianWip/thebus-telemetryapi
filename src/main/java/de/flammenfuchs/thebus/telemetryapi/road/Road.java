package de.flammenfuchs.thebus.telemetryapi.road;

public interface Road {

    int getId();

    int[] getLaneIds();

    int[] getPathLaneIds();
}
