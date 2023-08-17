package de.flammenfuchs.thebus.telemetryapi.world;

import java.util.Date;

public interface World {

    String getName();

    boolean isMainMenu();

    Date getDateTime();

    boolean isNightLightEnabled();

    float getTimeFactor();

    float getLatitude();

    float getLongitude();

    float getTemperature();

    float getWetness();

    float getRainIntensity();

    float getSnowIntensity();

    float getSnowPack();

    float getCloudIntensity();

    float getNebularIntensity();

    float getWindIntensity();
}
