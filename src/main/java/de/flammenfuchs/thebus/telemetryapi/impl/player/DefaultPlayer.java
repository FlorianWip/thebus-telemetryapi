package de.flammenfuchs.thebus.telemetryapi.impl.player;

import com.google.gson.annotations.SerializedName;
import de.flammenfuchs.thebus.telemetryapi.impl.location.DefaultLocation3D;
import de.flammenfuchs.thebus.telemetryapi.impl.location.DefaultRotation;
import de.flammenfuchs.thebus.telemetryapi.player.Player;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class DefaultPlayer implements Player {

    @SerializedName("Mode")
    private final String mode;

    @SerializedName("CurrentVehicle")
    private final String currentVehicle;

    private final DefaultLocation3D location;

    private final DefaultRotation rotation;
}
