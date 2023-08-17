package de.flammenfuchs.thebus.telemetryapi.road.lane;

import de.flammenfuchs.thebus.telemetryapi.map.Point;

public interface Lane {

    int getId();

    Point[] getPoints();
}
