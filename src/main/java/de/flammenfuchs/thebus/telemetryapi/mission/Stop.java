package de.flammenfuchs.thebus.telemetryapi.mission;

import java.util.Date;

public interface Stop {

    String getStopName();

    String getGroupName();

    Date getArrivalTime();

    Date getDepatureTime();

    int getBoardingPeople();

    int getDeboardingPeople();
}
