class BankAccount {
    protected double balance;

    BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
    }

    double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double initialBalance) {
        super(initialBalance);
    }
    // can add interest logic here
}

class LoanAccount extends BankAccount {
    private double loanAmount;

    LoanAccount(double initialLoan) {
        super(0); // loan accounts don’t have deposits
        this.loanAmount = initialLoan;
    }

    void repay(double amount) {
        if (amount > 0 && amount <= loanAmount) loanAmount -= amount;
    }

    double getLoanAmount() {
        return loanAmount;
    }
}

public class TestAccounts {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1000);
        sa.deposit(500);
        sa.withdraw(200);
        System.out.println("Savings balance: " + sa.getBalance());

        LoanAccount la = new LoanAccount(2000);
        la.repay(500);
        System.out.println("Remaining loan: " + la.getLoanAmount());
    }
}
