//Write an abstract class "Bank" which has a non-abstract method "getInterestRate()" and an abstract method "calculateInterest()". Implement two subclasses "SavingsAccount" and "FixedDeposit" which implement the method "calculateInterest()" according to their own interest calculation formulae.

abstract class Bank{
   int getInterestRate(String typeofAccount){
     if(typeofAccount.equals("saving")){
       return 5;
     }
     else{
       return 7;
     }
   }
   abstract void calculateInterest(int amount);
}
class SavingAccount extends Bank{
  void calculateInterest(int amount){
    int interest=(amount*getInterestRate("saving"))/100;
    System.out.println(interest);
    
  }
  
}
class FixedDeposit extends Bank{
  void calculateInterest(int amount){
    int interest=(amount*getInterestRate("fixed"))/100;
    System.out.println(interest);
    
  }
}
 
class BankUsingAbstractMethod{
  public static void main(String args[]){
   Bank saccount=new SavingAccount();
    saccount.calculateInterest(10000);
 
    Bank faccount=new FixedDeposit();
    faccount.calculateInterest(10000);
  }
}