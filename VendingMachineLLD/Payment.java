package VendingMachineLLD;

public class Payment {
    private double balance;

    public void insertCoin(double amount) {
        balance += amount;
    }

    public boolean isSufficient(double price) {
        return balance >= price;
    }

    public void deduct(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void reset() {
        balance = 0;
    }
}

