package com.parkinglot;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.HashMap;
/**
 * Created by Sriram on 05/06/18.
 */
public class Commands {
    public Map<String, Method> commandsMap;

    public Commands() {
        commandsMap = new HashMap<String, Method>();
        try {
            populateCommandsHashMap();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
    private void populateCommandsHashMap() throws NoSuchMethodException {
        commandsMap.put("create_parking_lot", ParkingLot.class.getMethod("createParkingLot", String.class));
        commandsMap.put("park", ParkingLot.class.getMethod("park", String.class, String.class));
        commandsMap.put("leave", ParkingLot.class.getMethod("leave", String.class));
        commandsMap.put("status", ParkingLot.class.getMethod("status"));
        commandsMap.put("registration_numbers_for_cars_with_colour", ParkingLot.class.getMethod("getRegistrationNumbersFromColor", String.class));
    }
}