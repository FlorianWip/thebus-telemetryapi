package de.flammenfuchs.thebus.telemetryapi.road;

import de.flammenfuchs.thebus.telemetryapi.location.Location2D;

public interface Bounds {

    Location2D getMin();

    Location2D getMax();
}
