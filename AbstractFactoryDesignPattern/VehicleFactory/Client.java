package AbstractFactoryDesignPattern.VehicleFactory;

public class Client {
    public static void main(String[] args) {
       VehicleFactory carFactory =
                VehicleFactoryProducer.getFactory("CAR");

        Vehicle car = carFactory.getVehicle("MICRO");
        car.book(10);

        VehicleFactory bikeFactory =
              VehicleFactoryProducer.getFactory("BIKE");

        Vehicle bike = bikeFactory.getVehicle("SPORTS");
        bike.book(10);
    }
}
