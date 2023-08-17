package de.flammenfuchs.thebus.telemetryapi.impl.road.lane;

import com.google.gson.annotations.SerializedName;
import de.flammenfuchs.thebus.telemetryapi.road.lane.PathLane;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class DefaultPathLane implements PathLane {

    @SerializedName("ID")
    private final int id;

    @SerializedName("Lanes")
    private final int[] laneIds;
}
