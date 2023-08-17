package de.flammenfuchs.thebus.telemetryapi.impl.vehicle;

import com.google.gson.annotations.SerializedName;
import de.flammenfuchs.thebus.telemetryapi.impl.location.DefaultLocation3D;
import de.flammenfuchs.thebus.telemetryapi.impl.location.DefaultRotation;
import de.flammenfuchs.thebus.telemetryapi.vehicle.Wheel;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class DefaultWheel implements Wheel {

    @SerializedName("CurrentSuspension")
    private final float suspension;

    @SerializedName("PreviousSuspension")
    private final float previousSuspension;

    @SerializedName("Location")
    private final DefaultLocation3D location;

    @SerializedName("Rotation")
    private final DefaultRotation rotation;

    @SerializedName("SuspensionForce")
    private final float suspensionForce;

    @SerializedName("OnGround")
    private final boolean onGround;

    @Getter(AccessLevel.NONE)
    @SerializedName("HasContraction")
    private final boolean contraction;

    public boolean hasContraction() {
        return contraction;
    }

}
