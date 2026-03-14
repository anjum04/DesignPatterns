package StateDesignPattern;

public class VendingMachine {
    VendingMachineState currentState;
    public VendingMachine(){
         this.currentState =new NoCoinState();
    }

    public void insertCoin() {
        currentState.insertCoin(this);
    }

    public void selectProduct() {
        currentState.selectProduct(this);
    }

    public void dispense() {
        currentState.dispenseProduct(this);
    }
    public void setState(VendingMachineState state) {
        this.currentState = state;
    }
}
