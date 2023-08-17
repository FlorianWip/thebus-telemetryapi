package de.flammenfuchs.thebus.telemetryapi.impl.map;

import com.google.gson.annotations.SerializedName;
import de.flammenfuchs.thebus.telemetryapi.impl.location.DefaultLocation2D;
import de.flammenfuchs.thebus.telemetryapi.map.Point;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class DefaultPoint implements Point {

    @SerializedName("pos")
    private final DefaultLocation2D position;

    private final DefaultLocation2D tanIn;

    private final DefaultLocation2D tanOut;
}
