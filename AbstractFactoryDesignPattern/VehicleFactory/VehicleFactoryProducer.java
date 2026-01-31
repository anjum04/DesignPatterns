package AbstractFactoryDesignPattern.VehicleFactory;

public class VehicleFactoryProducer {
    static VehicleFactory getFactory(String type) {
        if (type.equalsIgnoreCase("CAR"))
            return new CarFactory();
        else if (type.equalsIgnoreCase("BIKE"))
            return new BikeFactory();
        return null;
    }
}
