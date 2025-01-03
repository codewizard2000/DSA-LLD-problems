package VendingMachineLLD;

public interface VendingMachineState {
    void selectProduct(Product product);
    void insertCoin(double amount);
    void dispenseProduct();
}
