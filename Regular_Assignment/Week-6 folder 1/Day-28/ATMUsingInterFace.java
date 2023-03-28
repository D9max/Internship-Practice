 interface ATM {
  void withdraw(double amount);
  void deposit(double amount);
  double getBalance();
}

 class SBIATM implements ATM {
  private double balance;

  public SBIATM(double initialBalance) {
    balance = initialBalance;
  }

  public void withdraw(double amount) {
    if (balance >= amount) {
      balance -= amount;
      System.out.println("Withdrawal of " + amount + " successful.");
    } else {
      System.out.println("Insufficient funds.");
    }
  }

  public void deposit(double amount) {
    balance += amount;
    System.out.println("Deposit of " + amount + " successful.");
  }

  public double getBalance() {
    return balance;
  }
}
  public class ATMUsingInterFace{
  public static void main(String[] args) {
    SBIATM atm = new SBIATM(1000);
    System.out.println(atm.getBalance());
    atm.deposit(100);
    System.out.println(atm.getBalance());
    atm.withdraw(200);
    System.out.println(atm.getBalance());
    atm.withdraw(500);
    System.out.println(atm.getBalance());
  }
}
