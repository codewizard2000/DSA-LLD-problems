package VendingMachineLLD;

public class ReadyState implements VendingMachineState {
    private VendingMachine machine;
    private Product product;

    public ReadyState(VendingMachine machine, Product product) {
        this.machine = machine;
        this.product = product;
    }

    @Override
    public void selectProduct(Product product) {
        System.out.println("Product already selected.");
    }

    @Override
    public void insertCoin(double amount) {
        machine.getPayment().insertCoin(amount);
        if (machine.getPayment().isSufficient(product.getPrice())) {
            machine.setState(new DispenseState(machine, product));
        } else {
            System.out.println("Please insert more coins.");
        }
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please insert coins first.");
    }
}
