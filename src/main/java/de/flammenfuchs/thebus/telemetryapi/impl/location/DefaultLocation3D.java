package de.flammenfuchs.thebus.telemetryapi.impl.location;

import com.google.gson.annotations.SerializedName;
import de.flammenfuchs.thebus.telemetryapi.location.Location3D;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class DefaultLocation3D implements Location3D {

    @SerializedName("X")
    private final float x;

    @SerializedName("Y")
    private final float y;

    @SerializedName("Z")
    private final float z;
}
