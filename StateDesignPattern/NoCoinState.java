package StateDesignPattern;

public class NoCoinState implements VendingMachineState{

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Coin is Inserted");
        machine.setState(new SelectProductState());
    }

    @Override
    public void selectProduct(VendingMachine machine) {
        System.out.println("Coin is Not Inserted");
    }

    @Override
    public void dispenseProduct(VendingMachine machine) {
        System.out.println("Coin is Not Inserted");
    }
}
