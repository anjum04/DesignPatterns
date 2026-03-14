package StateDesignPattern;

public class SelectProductState implements VendingMachineState{
    VendingMachineState state;

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("product is not selected");
    }

    @Override
    public void selectProduct(VendingMachine machine) {
        System.out.println("product is selected");
        machine.setState(new DispenseProductState());
    }

    @Override
    public void dispenseProduct(VendingMachine machine) {
        System.out.println("product is not selected");
    }
}
