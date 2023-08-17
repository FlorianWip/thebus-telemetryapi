package de.flammenfuchs.thebus.telemetryapi.map;

import de.flammenfuchs.thebus.telemetryapi.location.Location2D;

public interface Map {
    
     String getName();
     String getDisplayName();
     Location2D getSize();
     float getScale();
     float getTimeLapse();
}
