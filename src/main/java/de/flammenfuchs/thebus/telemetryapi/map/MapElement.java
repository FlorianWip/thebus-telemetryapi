package de.flammenfuchs.thebus.telemetryapi.map;

import com.google.gson.annotations.SerializedName;
import de.flammenfuchs.thebus.telemetryapi.impl.location.DefaultLocation2D;
import de.flammenfuchs.thebus.telemetryapi.location.Location2D;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

public interface MapElement {
    
    int getId();
    
    int getLaneId();

    int getPathLaneId();
    
    String getName();
    
    String getLocationName();

    Location2D getOrigin();
}
