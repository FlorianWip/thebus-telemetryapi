package de.flammenfuchs.thebus.telemetryapi.impl.location;

import com.google.gson.annotations.SerializedName;
import de.flammenfuchs.thebus.telemetryapi.location.Location2D;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class DefaultLocation2D implements Location2D {

    @SerializedName("X")
    private final float x;

    @SerializedName("Y")
    private final float y;
}
