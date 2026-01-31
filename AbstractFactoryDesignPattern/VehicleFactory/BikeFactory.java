package AbstractFactoryDesignPattern.VehicleFactory;

public class BikeFactory extends VehicleFactory{
    @Override
    Vehicle getVehicle(String type) {
        switch (type){
            case "Normal":
                return new NormalBike();
            case "SPORTS":
                return new SportsBike();
            default:
                return null;
        }
    }
}
