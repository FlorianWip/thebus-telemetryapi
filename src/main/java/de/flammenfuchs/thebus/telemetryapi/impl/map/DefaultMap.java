package de.flammenfuchs.thebus.telemetryapi.impl.map;

import com.google.gson.annotations.SerializedName;
import de.flammenfuchs.thebus.telemetryapi.impl.location.DefaultLocation2D;
import de.flammenfuchs.thebus.telemetryapi.map.Map;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class DefaultMap implements Map {

    @SerializedName("MapName")
    private final String name;

    @SerializedName("MapDisplayName")
    private final String displayName;

    @SerializedName("WorldSize")
    private final DefaultLocation2D size;

    @SerializedName("WorldScale")
    private final float scale;

    @SerializedName("TimeLapse")
    private final float timeLapse;
}
