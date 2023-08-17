package de.flammenfuchs.thebus.telemetryapi.player;

import de.flammenfuchs.thebus.telemetryapi.location.Location3D;
import de.flammenfuchs.thebus.telemetryapi.location.Rotation;

public interface Player {

    String getMode();

    String getCurrentVehicle();

    Location3D getLocation();

    Rotation getRotation();
}
