package VendingMachineLLD;

public class DispenseState implements VendingMachineState {
    private VendingMachine machine;
    private Product product;

    public DispenseState(VendingMachine machine, Product product) {
        this.machine = machine;
        this.product = product;
    }

    @Override
    public void selectProduct(Product product) {
        System.out.println("Dispensing in progress. Please wait.");
    }

    @Override
    public void insertCoin(double amount) {
        System.out.println("Dispensing in progress. Please wait.");
    }

    @Override
    public void dispenseProduct() {
        machine.getInventory().dispenseProduct(product);
        machine.getPayment().deduct(product.getPrice());
        System.out.println("Dispensed: " + product.getName());
        machine.setState(new IdleState(machine));
    }
}
