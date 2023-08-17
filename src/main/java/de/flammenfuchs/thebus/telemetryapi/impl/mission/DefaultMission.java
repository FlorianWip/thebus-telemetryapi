package de.flammenfuchs.thebus.telemetryapi.impl.mission;

import com.google.gson.annotations.SerializedName;
import de.flammenfuchs.thebus.telemetryapi.mission.Mission;
import de.flammenfuchs.thebus.telemetryapi.mission.Stop;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class DefaultMission implements Mission {

    @SerializedName("MissionClassName")
    private final String missionClassName;

    @SerializedName("CurrentStop")
    private final DefaultStop currentStop;

    @SerializedName("CurrentStopIndex")
    private final int currentStopIndex;

    @SerializedName("NextStop")
    private final DefaultStop nextStop;

    @SerializedName("NextStopIndex")
    private final int nextStopIndex;

    @SerializedName("LastStopReached")
    private final DefaultStop lastStop;

    @SerializedName("LastStopReachedIndex")
    private final int lastStopIndex;

    @SerializedName("StartStopReached")
    private final boolean startStopReached;

    @SerializedName("DestinationStopReached")
    private final boolean destinationStopReached;

    @SerializedName("Stops")
    private final DefaultStop[] stops;

    @SerializedName("PassengersAtCurrentStop")
    private final int passengersAtCurrentStop;

    @SerializedName("CurrentCheckedPassengers")
    private final int currentCheckedPassengers;

    @SerializedName("IsInCheckInMode")
    private final boolean inCheckInMode;

    public Stop getStop(int index) {
        return stops[index];
    }
}
