package VendingMachineLLD;

public class IdleState implements VendingMachineState {
    private VendingMachine machine;

    public IdleState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void selectProduct(Product product) {
        if (machine.getInventory().isAvailable(product)) {
            machine.setState(new ReadyState(machine, product));
        } else {
            System.out.println("Product not available.");
        }
    }

    @Override
    public void insertCoin(double amount) {
        System.out.println("Please select a product first.");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please select a product first.");
    }
}
