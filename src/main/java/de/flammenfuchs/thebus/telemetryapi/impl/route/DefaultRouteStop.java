package de.flammenfuchs.thebus.telemetryapi.impl.route;

import com.google.gson.annotations.SerializedName;
import de.flammenfuchs.thebus.telemetryapi.impl.location.DefaultLocation2D;
import de.flammenfuchs.thebus.telemetryapi.route.RouteStop;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class DefaultRouteStop implements RouteStop {

    @SerializedName("ID")
    private final int id;

    @SerializedName("MapElementID")
    private final int mapElementId;

    @SerializedName("LaneID")
    private final int laneId;

    @SerializedName("PathLaneId")
    private final int pathLaneId;

    @SerializedName("Name")
    private final String name;

    @SerializedName("GroupName")
    private final String groupName;

    @SerializedName("Origin")
    private final DefaultLocation2D origin;
}
