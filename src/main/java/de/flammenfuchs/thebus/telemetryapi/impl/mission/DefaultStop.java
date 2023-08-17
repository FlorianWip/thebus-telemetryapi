package de.flammenfuchs.thebus.telemetryapi.impl.mission;

import com.google.gson.annotations.SerializedName;
import de.flammenfuchs.thebus.telemetryapi.mission.Stop;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@RequiredArgsConstructor
@Getter
public class DefaultStop implements Stop {

    @SerializedName("StopName")
    private final String stopName;

    @SerializedName("GroupName")
    private final String groupName;

    @SerializedName("ArrivalTime")
    private final Date arrivalTime;

    @SerializedName("DepatureTime")
    private final Date depatureTime;

    @SerializedName("BoardingPeopleCount")
    private final int boardingPeople;

    @SerializedName("DeboardingPeopleCount")
    private final int deboardingPeople;
}
