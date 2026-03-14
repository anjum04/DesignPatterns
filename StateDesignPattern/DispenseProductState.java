package StateDesignPattern;

public class DispenseProductState implements VendingMachineState{

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("product is not dispensed");
    }

    @Override
    public void selectProduct(VendingMachine machine) {
        System.out.println("product is not dispensed");
    }

    @Override
    public void dispenseProduct(VendingMachine machine) {
        System.out.println("product is dispensed");
        machine.setState(new NoCoinState());
    }
}
