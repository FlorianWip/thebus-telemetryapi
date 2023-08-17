package de.flammenfuchs.thebus.telemetryapi.impl.world;

import com.google.gson.annotations.SerializedName;
import de.flammenfuchs.thebus.telemetryapi.TelemetryApi;
import de.flammenfuchs.thebus.telemetryapi.world.World;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@RequiredArgsConstructor
@Getter
public class DefaultWorld implements World {

    @SerializedName("LevelName")
    private final String name;

    @SerializedName("IsInMainMenu")
    private final boolean mainMenu;

    @SerializedName("DateTime")
    private final Date dateTime;

    @SerializedName("NightLightEnabled")
    private final boolean nightLightEnabled;

    @SerializedName("TimeFactor")
    private final float timeFactor;

    @SerializedName("BaseLatitude")
    private final float latitude;

    @SerializedName("BaseLongitude")
    private final float longitude;

    @SerializedName("Temperature")
    private final float temperature;

    @SerializedName("Wetness")
    private final float wetness;

    @SerializedName("RainIntensity")
    private final float rainIntensity;

    @SerializedName("SnowIntensity")
    private final float snowIntensity;

    @SerializedName("SnowPack")
    private final float snowPack;

    @SerializedName("CloudIntensity")
    private final float cloudIntensity;

    @SerializedName("NebularIntensity")
    private final float nebularIntensity;

    @SerializedName("WindIntensity")
    private final float windIntensity;
}
