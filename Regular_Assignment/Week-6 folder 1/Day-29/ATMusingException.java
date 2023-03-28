class InvalidAmountException extends Exception{
  InvalidAmountException(String str){
    super(str);
  }
}
class ATM{
  int balance =50000;
  void withdraw(int WithdrwaAmount) throws InvalidAmountException{
    if(WithdrwaAmount>balance){
      throw new InvalidAmountException("invalid amount insufficient balence");
    }
    else if(WithdrwaAmount%100!=0){
      throw new InvalidAmountException("invalid Amount should we mutiple of 100");
    }
    else{
      balance=balance-WithdrwaAmount;
      System.out.println("Sucsuss");
    }
  }
}
class ATMusingException{
  public static void main(String args[]){
    ATM atm = new ATM();
    try{
      atm.withdraw(25000);
    }
    catch(InvalidAmountException e){
    System.out.println(e);
  }
}
}