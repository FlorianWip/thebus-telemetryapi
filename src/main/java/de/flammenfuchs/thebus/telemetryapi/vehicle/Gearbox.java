package de.flammenfuchs.thebus.telemetryapi.vehicle;

public interface Gearbox {

    int getCurrentGear();

    int getTargetGear();

    int getGearCount();
}
