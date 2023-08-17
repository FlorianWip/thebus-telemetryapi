package de.flammenfuchs.thebus.telemetryapi.mission;

public interface Mission {

    String getMissionClassName();

    Stop getCurrentStop();

    int getCurrentStopIndex();

    Stop getNextStop();

    int getNextStopIndex();

    Stop getLastStop();

    int getLastStopIndex();

    boolean isStartStopReached();

    boolean isDestinationStopReached();

    Stop[] getStops();
    Stop getStop(int index);

    int getPassengersAtCurrentStop();

    int getCurrentCheckedPassengers();

    boolean isInCheckInMode();
}
