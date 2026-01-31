package AbstractFactoryDesignPattern.VehicleFactory;

abstract class Bike implements Vehicle {
    int baseCost;

    @Override
    public void book(int distance) {
        System.out.println("Bike booked. Cost = " + baseCost * distance);
    }
}