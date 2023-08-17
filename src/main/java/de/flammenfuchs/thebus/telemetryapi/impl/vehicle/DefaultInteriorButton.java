package de.flammenfuchs.thebus.telemetryapi.impl.vehicle;

import com.google.gson.annotations.SerializedName;
import de.flammenfuchs.thebus.telemetryapi.vehicle.InteriorButton;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class DefaultInteriorButton implements InteriorButton {

    @SerializedName("Name")
    private final String name;

    @SerializedName("Tooltip")
    private final String tooltip;

    @SerializedName("State")
    private final String state;

    @SerializedName("Value")
    private final String value;

    @SerializedName("Actions")
    private final String[] actions;

}
