package de.flammenfuchs.thebus.telemetryapi.impl.vehicle;

import com.google.gson.annotations.SerializedName;
import de.flammenfuchs.thebus.telemetryapi.impl.location.DefaultLocation3D;
import de.flammenfuchs.thebus.telemetryapi.impl.location.DefaultRotation;
import de.flammenfuchs.thebus.telemetryapi.vehicle.Vehicle;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Collections;
import java.util.Map;

@RequiredArgsConstructor
@Getter
public class DefaultVehicle implements Vehicle {

    @SerializedName("ActorName")
    private final String actorName;

    @SerializedName("IsPlayerControlled")
    private final boolean playerControlled;

    @SerializedName("InputIdentifier")
    private final String inputIdentifier;

    @SerializedName("DaytimeLight")
    private final boolean dayTimeLightEnabled;

    @SerializedName("ParkingLight")
    private final boolean parkingLightEnabled;

    @SerializedName("Headlight")
    private final boolean headLightEnabled;

    @SerializedName("TravellerLight")
    private final boolean travellerLightEnabled;

    @SerializedName("FogLight")
    private final boolean fogLightEnabled;

    @SerializedName("RearFogLight")
    private final boolean rearFogLightEnabled;

    @SerializedName("MainLight")
    private final boolean mainLightEnabled;

    @SerializedName("DashboardLight")
    private final boolean dashboardLightEnabled;

    @SerializedName("Speed")
    private final float speed;

    @SerializedName("RPM")
    private final float rpm;

    @SerializedName("IdleRPM")
    private final float idleRpm;

    @SerializedName("MaxRPM")
    private final float maxRpm;

    @SerializedName("Mass")
    private final int weight;

    @SerializedName("Steering")
    private final float steering;

    @SerializedName("Throttle")
    private final float throttle;

    @SerializedName("Brake")
    private final float brake;

    @SerializedName("FixingBrake")
    private final boolean parkingBrakeEnabled;

    @SerializedName("Load")
    private final float load;

    @SerializedName("EngineStarted")
    private final boolean engineStarted;

    @SerializedName("GearboxType")
    private final String gearboxType;

    @SerializedName("LowFuelWarning")
    private final boolean lowFuelWarning;

    @SerializedName("Location")
    private final DefaultLocation3D location;

    @SerializedName("Rotation")
    private final DefaultRotation rotation;

    @SerializedName("IndicatorState")
    private final int indicatorState;

    @SerializedName("IndicatorValue")
    private final int indicatorValue;

    @SerializedName("WarningLights")
    private final boolean WarningLightsEnabled;

    @SerializedName("IsOffroad")
    private final boolean offroad;

    @SerializedName("Gearbox")
    private final DefaultGearbox gearbox;

    @SerializedName("Wheels")
    private final DefaultWheel[] wheels;

    @SerializedName("IsRadioPlaying")
    private final boolean radioPlaying;

    @SerializedName("ActiveRadioChannel")
    private final String radioChannel;

    @SerializedName("RadioVolume")
    private final float radioVolume;

    @SerializedName("PassengerDoorOpen")
    private final boolean passengerDoorOpen;

    @SerializedName("LuggageDoorOpen")
    private final boolean luggageDoorOpen;

    @SerializedName("NumSeats")
    private final int seatsAmount;

    @SerializedName("NumOccupiedSeats")
    private final int occupiedSeatsAmount;

    @SerializedName("IgnitionEnabled")
    private final boolean ignitionEnabled;

    @SerializedName("EngineTemperature")
    private final float engineTemperature;

    @SerializedName("WiperLevel")
    private final int wiperLevel;

    @SerializedName("DestinationDisplayActive")
    private final boolean destinationDisplayActive;

    @SerializedName("CruiseControlEnabled")
    private final boolean cruiseControlEnabled;

    @SerializedName("AllowedSpeed")
    private final float allowedSpeed;

    @SerializedName("IsAtStop")
    private final boolean atStop;

    @SerializedName("DirtIntensity")
    private final float dirtIntensity;

    @SerializedName("CurrentFuel")
    private final float currentFuel;

    @SerializedName("MaxFuel")
    private final float maxFuel;

    @SerializedName("DisplayFuel")
    private final float displayFuel;

    @SerializedName("Buttons")
    private final DefaultInteriorButton[] buttons;

    @SerializedName("Doors")
    private final DefaultDoor[] doors;

    @SerializedName("UMG")
    private final DefaultUMG umg;

    @SerializedName("AllLamps")
    @Getter(AccessLevel.NONE)
    private final Map<String, Integer> allLamps;

    @SerializedName("Powermeter")
    private final float powerMeter;

    public Map<String, Integer> getAllLamps() {
        return Collections.unmodifiableMap(allLamps);
    }
}
