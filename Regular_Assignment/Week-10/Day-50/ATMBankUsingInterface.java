/*Create an interface called ATM with the following method signatures:
void checkBalance()void withdraw(double amount)void deposit(double amount)
Create a class called BankAccount that implements the ATM interface. The BankAccount class should have the following properties:
String accountNumberString accountNamedouble balance
Implement the methods of the ATM interface in the BankAccount class. For example, the checkBalance() method should print out the current balance of the account, the withdraw(double amount) method should subtract the specified amount from the balance, and the deposit(double amount) method should add the specified amount to the balance.
Write a Main class that creates an instance of BankAccount and allows the user to interact with the account by calling the checkBalance(), withdraw(double amount), and deposit(double amount) methods. For example, the user should be able to input an amount to withdraw or deposit, and the program should update the balance accordingly*/

interface ATM {
  void checkBalance();

  void withdraw(double amount);

  void deposit(double amount);
}

class BankAccount implements ATM {
  String accountNumber;
  String accountName;
  double balance;

  BankAccount(String accountNumber, String accountName, double balance) {
    this.accountName = accountName;
    this.accountName = accountName;
    this.balance = balance;
  }

  public void checkBalance() {
    System.out.println("Current balance: " + balance);
  }

  public void withdraw(double amount) {
    if (amount > balance) {
      System.out.println("Insufficient balance.");
    } else {
      balance -= amount;
      System.out.println("Withdrawal successful");
      System.out.println("the Current balance: " + balance);
    }
  }

  public void deposit(double amount) {
    balance += amount;
    System.out.println("Deposit successful ");
    System.out.println("Current balance: " + balance);
  }
}

public class ATMBankUsingInterface {
  public static void main(String[] args) {
    BankAccount account = new BankAccount("456998586", "Mubarak M", 1000);

    account.checkBalance();
    account.withdraw(500);
    account.deposit(1000);
  }
}