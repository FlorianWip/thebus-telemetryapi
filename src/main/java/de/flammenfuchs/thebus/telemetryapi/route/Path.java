package de.flammenfuchs.thebus.telemetryapi.route;

import java.awt.Color;

public interface Path {

    Color getColor();

    int[] getPathLanes();
}
