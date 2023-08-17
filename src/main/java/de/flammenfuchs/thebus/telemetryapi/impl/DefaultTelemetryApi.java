package de.flammenfuchs.thebus.telemetryapi.impl;

import de.flammenfuchs.thebus.telemetryapi.TelemetryApi;
import de.flammenfuchs.thebus.telemetryapi.impl.http.HttpClient;
import de.flammenfuchs.thebus.telemetryapi.impl.http.HttpFailHandler;
import de.flammenfuchs.thebus.telemetryapi.impl.map.DefaultMap;
import de.flammenfuchs.thebus.telemetryapi.impl.mission.DefaultMission;
import de.flammenfuchs.thebus.telemetryapi.impl.player.DefaultPlayer;
import de.flammenfuchs.thebus.telemetryapi.impl.road.DefaultRoadMap;
import de.flammenfuchs.thebus.telemetryapi.impl.route.DefaultRoute;
import de.flammenfuchs.thebus.telemetryapi.impl.vehicle.DefaultVehicle;
import de.flammenfuchs.thebus.telemetryapi.impl.world.DefaultWorld;
import de.flammenfuchs.thebus.telemetryapi.map.Map;
import de.flammenfuchs.thebus.telemetryapi.mission.Mission;
import de.flammenfuchs.thebus.telemetryapi.player.Player;
import de.flammenfuchs.thebus.telemetryapi.road.RoadMap;
import de.flammenfuchs.thebus.telemetryapi.route.Route;
import de.flammenfuchs.thebus.telemetryapi.vehicle.Vehicle;
import de.flammenfuchs.thebus.telemetryapi.world.World;

import javax.sound.midi.Soundbank;
import java.io.ByteArrayInputStream;

public class DefaultTelemetryApi implements TelemetryApi {

    private final HttpClient httpClient;
    private final Cache cache;
    private final HttpFailHandler failHandler;

    public DefaultTelemetryApi() {
        this.httpClient = new HttpClient();
        this.cache = new Cache() {
            @Override
            public void update() {
                DefaultTelemetryApi.this.getVehicles();
                DefaultTelemetryApi.this.getVehicleNames();
                DefaultTelemetryApi.this.getCurrentVehicle();
                DefaultTelemetryApi.this.getPlayer();
                DefaultTelemetryApi.this.getWorld();
                DefaultTelemetryApi.this.getMap();
                DefaultTelemetryApi.this.getMission();
                DefaultTelemetryApi.this.getRoadMap();
                DefaultTelemetryApi.this.getRoute();
            }
        };
        this.failHandler = (endpoint, ex) -> {
            System.out.println("Exception thrown by " +  HttpClient.BASE_URL + endpoint);
            ex.printStackTrace();
        };
    }

    @Override
    public boolean isAvailable() {
        return httpClient.get("Player", (endpoint, ex) -> {}) != null;
    }

    @Override
    public Vehicle[] getVehicles() {
        String[] names = getVehicleNames();
        Vehicle[] vehicles = new Vehicle[names.length];
        for (int i = 0; i < names.length; i++) {
            vehicles[i] = getVehicle(names[i]);
        }
        cache.setVehicles(vehicles);
        return vehicles;
    }

    @Override
    public String[] getVehicleNames() {
        String[] names = httpClient.getJson("Vehicles", String[].class, failHandler);
        cache.setVehicleNames(names);
        return names;
    }

    @Override
    public Vehicle getVehicle(String name) {
        return httpClient.getJson("Vehicles/" + name, DefaultVehicle.class, failHandler);
    }

    @Override
    public Vehicle getCurrentVehicle() {
        Vehicle currentVehicle = httpClient.getJson("Vehicles/Current",
                DefaultVehicle.class, failHandler);
        cache.setCurrentVehicle(currentVehicle);
        return currentVehicle;
    }

    @Override
    public Player getPlayer() {
        Player player = httpClient.getJson("Player", DefaultPlayer.class, failHandler);
        cache.setPlayer(player);
        return player;
    }

    @Override
    public World getWorld() {
        World world = httpClient.getJson("World", DefaultWorld.class, failHandler);
        cache.setWorld(world);
        return world;
    }

    @Override
    public Map getMap() {
        Map map = httpClient.getJson("Map", DefaultMap.class, failHandler);
        cache.setMap(map);
        return map;
    }

    @Override
    public Mission getMission() {
        Mission mission = httpClient.getJson("Mission", DefaultMission.class, failHandler);
        cache.setMission(mission);
        return mission;
    }

    @Override
    public RoadMap getRoadMap() {
        RoadMap roadMap = httpClient.getJson("RoadMap", DefaultRoadMap.class, failHandler);
        cache.setRoadMap(roadMap);
        return roadMap;
    }

    @Override
    public Route getRoute() {
        Route route = httpClient.getJson("Route", DefaultRoute.class, failHandler);
        cache.setRoute(route);
        return route;
    }

    @Override
    public Cache getCache() {
        return cache;
    }
}
