package de.flammenfuchs.thebus.telemetryapi.impl.map;

import com.google.gson.annotations.SerializedName;
import de.flammenfuchs.thebus.telemetryapi.impl.location.DefaultLocation2D;
import de.flammenfuchs.thebus.telemetryapi.map.MapElement;
import lombok.Getter;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Getter
public class DefaultMapElement implements MapElement {

    @SerializedName("ID")
    private final int id;

    @SerializedName("LaneID")
    private final int laneId;

    @SerializedName("PathLaneID")
    private final int pathLaneId;

    @SerializedName("Name")
    private final String name;

    @SerializedName("LocationName")
    private final String locationName;

    @SerializedName("Origin")
    private final DefaultLocation2D origin;
}
