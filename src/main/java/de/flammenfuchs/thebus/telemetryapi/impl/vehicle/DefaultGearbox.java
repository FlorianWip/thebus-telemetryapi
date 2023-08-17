package de.flammenfuchs.thebus.telemetryapi.impl.vehicle;

import com.google.gson.annotations.SerializedName;
import de.flammenfuchs.thebus.telemetryapi.vehicle.Gearbox;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class DefaultGearbox implements Gearbox {

    @SerializedName("CurrentGear")
    private final int currentGear;

    @SerializedName("TargetGear")
    private final int targetGear;

    @SerializedName("GearCount")
    private final int gearCount;
}
