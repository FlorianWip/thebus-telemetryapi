package de.flammenfuchs.thebus.telemetryapi.impl.route;

import com.google.gson.annotations.SerializedName;
import de.flammenfuchs.thebus.telemetryapi.route.Path;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.awt.*;

@RequiredArgsConstructor
@Getter
public class DefaultPath implements Path {

    @SerializedName("Color")
    private final Color color;

    @SerializedName("PathLanes")
    private final int[] pathLanes;
}
