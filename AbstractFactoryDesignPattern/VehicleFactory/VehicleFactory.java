package AbstractFactoryDesignPattern.VehicleFactory;

abstract class VehicleFactory {
    abstract Vehicle getVehicle(String type);
}
