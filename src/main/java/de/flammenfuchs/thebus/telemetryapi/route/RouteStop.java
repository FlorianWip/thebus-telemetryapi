package de.flammenfuchs.thebus.telemetryapi.route;

import de.flammenfuchs.thebus.telemetryapi.location.Location2D;

public interface RouteStop {

    int getId();

    int getMapElementId();

    int getLaneId();

    int getPathLaneId();

    String getName();

    String getGroupName();

    Location2D getOrigin();
}
