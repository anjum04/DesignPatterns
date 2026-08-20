package StateDesignPattern.ElevatorDesign;

import java.util.ArrayList;
import java.util.List;

class ElevatorController {

    private List<Elevator> elevators;

    public ElevatorController(int n) {

        elevators = new ArrayList<>();

        for(int i=0;i<n;i++)
            elevators.add(new Elevator(i));
    }

    public void requestElevator(Request request) {

        Elevator elevator = findBestElevator(request);

        elevator.addRequest(request.getSourceFloor());
        elevator.addRequest(request.getDestinationFloor());
    }

    private Elevator findBestElevator(Request request) {

        Elevator best = elevators.get(0);

        int minDistance = Integer.MAX_VALUE;

        for(Elevator elevator : elevators) {

            int distance = Math.abs(
                    elevator.getCurrentFloor() - request.getSourceFloor());

            if(distance < minDistance) {

                minDistance = distance;
                best = elevator;
            }
        }

        return best;
    }
}
