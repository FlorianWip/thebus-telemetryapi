package de.flammenfuchs.thebus.telemetryapi.impl.road.lane;

import com.google.gson.annotations.SerializedName;
import de.flammenfuchs.thebus.telemetryapi.impl.map.DefaultPoint;
import de.flammenfuchs.thebus.telemetryapi.road.lane.Lane;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class DefaultLane implements Lane {

    @SerializedName("ID")
    private final int id;

    @SerializedName("Points")
    private final DefaultPoint[] points;
}
