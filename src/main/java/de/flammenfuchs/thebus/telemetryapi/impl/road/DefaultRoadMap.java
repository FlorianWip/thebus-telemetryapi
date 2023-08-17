package de.flammenfuchs.thebus.telemetryapi.impl.road;

import com.google.gson.annotations.SerializedName;
import de.flammenfuchs.thebus.telemetryapi.impl.map.DefaultMapElement;
import de.flammenfuchs.thebus.telemetryapi.impl.road.lane.DefaultLane;
import de.flammenfuchs.thebus.telemetryapi.impl.road.lane.DefaultPathLane;
import de.flammenfuchs.thebus.telemetryapi.impl.route.DefaultRouteStop;
import de.flammenfuchs.thebus.telemetryapi.road.RoadMap;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class DefaultRoadMap implements RoadMap {

    @SerializedName("Bounds")
    private final DefaultBounds bounds;

    @SerializedName("Lanes")
    private final DefaultLane[] lanes;

    @SerializedName("PathLanes")
    private final DefaultPathLane[] pathLanes;

    @SerializedName("Roads")
    private final DefaultRoad[] roads;

    @SerializedName("RoadTypeContainers")
    private final DefaultRoadTypeContainer[] roadTypeContainers;

    @SerializedName("MapElements")
    private final DefaultMapElement[] mapElements;

    @SerializedName("RouteStops")
    private final DefaultRouteStop[] routeStops;


}
