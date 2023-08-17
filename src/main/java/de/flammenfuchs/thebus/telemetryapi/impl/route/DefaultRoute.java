package de.flammenfuchs.thebus.telemetryapi.impl.route;

import com.google.gson.annotations.SerializedName;
import de.flammenfuchs.thebus.telemetryapi.route.Route;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class DefaultRoute implements Route {

    @SerializedName("Paths")
    private final DefaultPath[] paths;
}
