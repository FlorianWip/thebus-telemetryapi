package de.flammenfuchs.thebus.telemetryapi.impl.vehicle;

import com.google.gson.annotations.SerializedName;
import de.flammenfuchs.thebus.telemetryapi.vehicle.Door;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class DefaultDoor implements Door {

    @SerializedName("Name")
    private final String name;

    @SerializedName("Open")
    private final boolean open;

    @SerializedName("Progress")
    private final float progress;

    @SerializedName("StopRequest")
    private final boolean stopRequest;

}
