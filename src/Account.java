public class Account {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) {

        if(amount <= this.balance && amount > 0) {
            this.balance -= amount;
        }
    }

    public double getBalance() {
        return this.balance;
    }
}
