package de.flammenfuchs.thebus.telemetryapi.impl.road;

import com.google.gson.annotations.SerializedName;
import de.flammenfuchs.thebus.telemetryapi.impl.location.DefaultLocation2D;
import de.flammenfuchs.thebus.telemetryapi.road.Bounds;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class DefaultBounds implements Bounds {

    @SerializedName("Min")
    private final DefaultLocation2D min;

    @SerializedName("Max")
    private final DefaultLocation2D max;
}
