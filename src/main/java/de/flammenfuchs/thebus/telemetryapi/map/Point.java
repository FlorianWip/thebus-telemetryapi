package de.flammenfuchs.thebus.telemetryapi.map;

import de.flammenfuchs.thebus.telemetryapi.location.Location2D;

public interface Point {
    
    Location2D getPosition();

    Location2D getTanIn();

    Location2D getTanOut();
}
