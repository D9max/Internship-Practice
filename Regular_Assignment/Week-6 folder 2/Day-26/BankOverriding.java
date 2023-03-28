class Bank {
   int bid=123;
  void rateOfIntrest() {
    System.out.println("rate of intrest is 10rs");
  }
}

class SBI extends Bank {
  void rateOfIntrest() {
    System.out.println("12hrs");
  }
}

class HDFC extends Bank {
   int bid=345;
  void print(){
    System.out.println(super.bid);
        System.out.println(bid);
  }
  void rateOfIntrest() {
    super.rateOfIntrest();
    System.out.println("14rs");
  }
}

public class BankOverriding {
  public static void main(String args[]) {
    HDFC hdfc = new HDFC();
    hdfc.rateOfIntrest();
    hdfc.print();
  }
}