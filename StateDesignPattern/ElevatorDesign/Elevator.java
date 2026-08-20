package StateDesignPattern.ElevatorDesign;

import java.util.Collections;
import java.util.PriorityQueue;

class Elevator {

    private int id;
    private int currentFloor;
    private Direction direction;
    private ElevatorState state;

    private PriorityQueue<Integer> upStops =
            new PriorityQueue<>();

    private PriorityQueue<Integer> downStops =
            new PriorityQueue<>(Collections.reverseOrder());

    public Elevator(int id) {
        this.id = id;
        currentFloor = 0;
        direction = Direction.IDLE;
        state = ElevatorState.DOOR_CLOSED;
    }

    public void addRequest(int floor) {

        if(floor > currentFloor)
            upStops.offer(floor);
        else
            downStops.offer(floor);
    }

    public void move() {

        if(direction == Direction.UP) {

            while(!upStops.isEmpty()) {

                currentFloor = upStops.poll();
                System.out.println("Stopping at " + currentFloor);
            }

            if(!downStops.isEmpty())
                direction = Direction.DOWN;
            else
                direction = Direction.IDLE;
        }

        else if(direction == Direction.DOWN) {

            while(!downStops.isEmpty()) {

                currentFloor = downStops.poll();
                System.out.println("Stopping at " + currentFloor);
            }

            if(!upStops.isEmpty())
                direction = Direction.UP;
            else
                direction = Direction.IDLE;
        }

        else {

            if(!upStops.isEmpty())
                direction = Direction.UP;
            else if(!downStops.isEmpty())
                direction = Direction.DOWN;

            move();
        }
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public Direction getDirection() {
        return direction;
    }
}