package VendingMachineLLD;

public class VendingMachine {
    private Inventory inventory = new Inventory();
    private Payment payment = new Payment();
    private VendingMachineState state;

    public VendingMachine() {
        this.state = new IdleState(this);
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public void selectProduct(Product product) {
        state.selectProduct(product);
    }

    public void insertCoin(double amount) {
        state.insertCoin(amount);
    }

    public void dispenseProduct() {
        state.dispenseProduct();
    }

    public Inventory getInventory() {
        return inventory;
    }

    public Payment getPayment() {
        return payment;
    }
}

