package StateDesignPattern.ElevatorDesign;

import java.util.ArrayList;
import java.util.List;

class Building {

    private List<Floor> floors;
    private ElevatorController controller;

    public Building(int totalFloors, int elevators) {

        floors = new ArrayList<>();

        for(int i=0;i<totalFloors;i++)
            floors.add(new Floor(i));

        controller = new ElevatorController(elevators);
    }
}