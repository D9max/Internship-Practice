class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super("Insufficient funds to complete withdrawal");
    }
}

class BankAccount {
    private double balance;

     BankAccount() {
        balance = 0.0;
    }

     void deposit(double amount) {
        balance += amount;
    }

     void withdraw(double amount) throws InsufficientFundsException {
        if (balance < amount) {
            throw new InsufficientFundsException();
        }
        balance -= amount;
    }

     double getBalance() {
        return balance;
    }
}

public class BankAccountException {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        System.out.println("Balance after deposit: " + account.getBalance());
        try {
            account.withdraw(100);
            System.out.println("Balance after withdrawal: " + account.getBalance());
            account.withdraw(1000);
        } catch (InsufficientFundsException e) {
            System.out.println("Failed to withdraw due to insufficient funds");
        }
    }
}
