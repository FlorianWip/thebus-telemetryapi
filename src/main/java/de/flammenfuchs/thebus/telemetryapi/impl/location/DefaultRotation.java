package de.flammenfuchs.thebus.telemetryapi.impl.location;

import com.google.gson.annotations.SerializedName;
import de.flammenfuchs.thebus.telemetryapi.location.Rotation;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class DefaultRotation implements Rotation {

    @SerializedName("Roll")
    private final float roll;

    @SerializedName("Pitch")
    private final float pitch;

    @SerializedName("Yaw")
    private final float yaw;
}
