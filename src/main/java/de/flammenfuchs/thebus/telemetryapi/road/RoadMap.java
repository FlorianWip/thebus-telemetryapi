package de.flammenfuchs.thebus.telemetryapi.road;

import de.flammenfuchs.thebus.telemetryapi.map.MapElement;
import de.flammenfuchs.thebus.telemetryapi.road.lane.Lane;
import de.flammenfuchs.thebus.telemetryapi.road.lane.PathLane;
import de.flammenfuchs.thebus.telemetryapi.route.RouteStop;

public interface RoadMap {

    Bounds getBounds();

    Lane[] getLanes();

    PathLane[] getPathLanes();

    Road[] getRoads();

    RoadTypeContainer[] getRoadTypeContainers();

    MapElement[] getMapElements();

    RouteStop[] getRouteStops();


}
