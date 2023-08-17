package de.flammenfuchs.thebus.telemetryapi.impl.road;

import com.google.gson.annotations.SerializedName;
import de.flammenfuchs.thebus.telemetryapi.road.RoadTypeContainer;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class DefaultRoadTypeContainer implements RoadTypeContainer {

    @SerializedName("ID")
    private final int id;

    @SerializedName("Name")
    private final String name;

    @SerializedName("Roads")
    private final int[] roadIds;
}
