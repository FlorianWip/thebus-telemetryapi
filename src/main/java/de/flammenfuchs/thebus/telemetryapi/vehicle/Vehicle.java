package de.flammenfuchs.thebus.telemetryapi.vehicle;

import de.flammenfuchs.thebus.telemetryapi.location.Location3D;
import de.flammenfuchs.thebus.telemetryapi.location.Rotation;

import java.util.Map;

public interface Vehicle {

    String getActorName();

    boolean isPlayerControlled();

    String getInputIdentifier();

    boolean isDayTimeLightEnabled();

    boolean isParkingLightEnabled();

    boolean isHeadLightEnabled();

    boolean isTravellerLightEnabled();

    boolean isFogLightEnabled();

    boolean isRearFogLightEnabled();

    boolean isMainLightEnabled();

    boolean isDashboardLightEnabled();

    float getSpeed();

    float getRpm();

    float getIdleRpm();

    float getMaxRpm();

    int getWeight();

    float getSteering();

    float getThrottle();

    float getBrake();

    boolean isParkingBrakeEnabled();

    float getLoad();

    boolean isEngineStarted();

    String getGearboxType();

    boolean isLowFuelWarning();

    Location3D getLocation();

    Rotation getRotation();

    int getIndicatorState();

    int getIndicatorValue();

    boolean isWarningLightsEnabled();

    boolean isOffroad();

    Gearbox getGearbox();

    Wheel[] getWheels();

    boolean isRadioPlaying();

    String getRadioChannel();

    float getRadioVolume();

    boolean isPassengerDoorOpen();

    boolean isLuggageDoorOpen();

    int getSeatsAmount();

    int getOccupiedSeatsAmount();

    boolean isIgnitionEnabled();

    float getEngineTemperature();

    int getWiperLevel();

    boolean isDestinationDisplayActive();

    boolean isCruiseControlEnabled();

    float getAllowedSpeed();

    boolean isAtStop();

    float getDirtIntensity();

    float getCurrentFuel();

    float getMaxFuel();

    float getDisplayFuel();

    InteriorButton[] getButtons();

    Door[] getDoors();

    UMG getUmg();

    Map<String, Integer> getAllLamps();

    float getPowerMeter();
}
