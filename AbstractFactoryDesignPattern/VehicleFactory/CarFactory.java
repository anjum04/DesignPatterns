package AbstractFactoryDesignPattern.VehicleFactory;

public class CarFactory extends VehicleFactory{
    @Override
    Vehicle getVehicle(String type) {
       switch (type){
           case "MICRO":
               return new MicroCar();
           case "MEGA":
               return new MegaCar();
           default:
               return null;
       }
    }
}
