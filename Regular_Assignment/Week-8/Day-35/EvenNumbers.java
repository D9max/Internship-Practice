import java.util.*;
class EvenNumbers{
  public static void main(String args[]){
    List<Integer> ls=new ArrayList<Integer>();
    Scanner sc=new Scanner(System.in);
    System.out.println("enter elements");
    for(int i=0;i<5;i++){
      ls.add(sc.nextInt());
    }
     System.out.println(ls);
    System.out.println("even numbers are:");
     for(Integer num:ls){
       if(num%2==0){
         System.out.println(num);
       }
     }
  }
}