package de.flammenfuchs.thebus.telemetryapi.impl.road;

import com.google.gson.annotations.SerializedName;
import de.flammenfuchs.thebus.telemetryapi.road.Road;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class DefaultRoad implements Road {

    @SerializedName("ID")
    private final int id;

    @SerializedName("Lanes")
    private final int[] laneIds;

    @SerializedName("PathLanes")
    private final int[] pathLaneIds;
}
