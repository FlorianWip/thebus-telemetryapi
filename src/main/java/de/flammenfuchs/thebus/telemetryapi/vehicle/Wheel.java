package de.flammenfuchs.thebus.telemetryapi.vehicle;

import de.flammenfuchs.thebus.telemetryapi.location.Location3D;
import de.flammenfuchs.thebus.telemetryapi.location.Rotation;

public interface Wheel {

    float getSuspension();

    float getPreviousSuspension();

    Location3D getLocation();

    Rotation getRotation();

    float getSuspensionForce();

    boolean isOnGround();

    boolean hasContraction();

}
