package de.flammenfuchs.thebus.telemetryapi.impl.vehicle;

import com.google.gson.annotations.SerializedName;
import de.flammenfuchs.thebus.telemetryapi.vehicle.UMG;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class DefaultUMG implements UMG {

    @SerializedName("Navigation")
    private final String navigationEndpoint;

    @SerializedName("Atron")
    private final String atronEndpoint;

    @SerializedName("Driver Display")
    private final String driverDisplayEndpoint;
}
