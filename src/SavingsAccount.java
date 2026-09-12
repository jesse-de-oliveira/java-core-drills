public class SavingsAccount extends Account {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        double totalDeduct = amount + 10.00;
        super.withdraw(totalDeduct);
    }
}
