package AbstractFactoryDesignPattern.VehicleFactory;

abstract class Car implements Vehicle {
    int baseCost;

    @Override
    public void book(int distance) {
        System.out.println("Car booked. Cost = " + baseCost * distance);
    }
}