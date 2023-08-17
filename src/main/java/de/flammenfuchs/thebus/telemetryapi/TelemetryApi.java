package de.flammenfuchs.thebus.telemetryapi;

import de.flammenfuchs.thebus.telemetryapi.map.Map;
import de.flammenfuchs.thebus.telemetryapi.mission.Mission;
import de.flammenfuchs.thebus.telemetryapi.player.Player;
import de.flammenfuchs.thebus.telemetryapi.road.RoadMap;
import de.flammenfuchs.thebus.telemetryapi.route.Route;
import de.flammenfuchs.thebus.telemetryapi.vehicle.Vehicle;
import de.flammenfuchs.thebus.telemetryapi.world.World;
import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.CompletableFuture;

public interface TelemetryApi {

    boolean isAvailable();

    Vehicle[] getVehicles();
    String[] getVehicleNames();
    Vehicle getVehicle(String name);
    Vehicle getCurrentVehicle();

    Player getPlayer();

    World getWorld();

    Map getMap();

    Mission getMission();

    RoadMap getRoadMap();

    Route getRoute();

    Cache getCache();

    static TelemetryApi getInstance() {
        return TelemetryApiContainer.getApi();
    }

    @Getter
    @Setter
    abstract class Cache {
        private Vehicle[] vehicles;
        private String[] vehicleNames;
        private Vehicle currentVehicle;
        private Player player;
        private World world;
        private Map map;
        private Mission mission;
        private RoadMap roadMap;
        private Route route;

        public abstract void update();
    }
}
