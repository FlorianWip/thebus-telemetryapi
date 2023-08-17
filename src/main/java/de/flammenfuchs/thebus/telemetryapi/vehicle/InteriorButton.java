package de.flammenfuchs.thebus.telemetryapi.vehicle;

public interface InteriorButton {

    String getName();

    String getTooltip();

    String getState();

    String getValue();

    String[] getActions();

}
