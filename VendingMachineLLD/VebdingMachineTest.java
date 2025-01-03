package VendingMachineLLD;

public class VebdingMachineTest {
    public static void main(String[] args) {
        // Create a vending machine
        VendingMachine vendingMachine = new VendingMachine();

        // Add products to the inventory
        Product cola = new Product("Cola", 1.50);
        Product chips = new Product("Chips", 1.00);
        Product candy = new Product("Candy", 0.75);

        vendingMachine.getInventory().addProduct(cola, 10);
        vendingMachine.getInventory().addProduct(chips, 5);
        vendingMachine.getInventory().addProduct(candy, 20);

        // Select a product
        vendingMachine.selectProduct(cola);

        // Insert coins
        vendingMachine.insertCoin(1.00);
        vendingMachine.insertCoin(0.50);

        // Dispense the product
        vendingMachine.dispenseProduct();

        // Check remaining balance
        System.out.println("Remaining balance: " + vendingMachine.getPayment().getBalance());
    }
}
