// class Demo {
//   public int price;
//   public int pid;
// }

// class Demo1 {
//     void printPrice(Demo d) {
//     System.out.println(d.price);
//   }
// }

// public class DefaultModifier {
//     void main(String args[]) {
//     Demo d = new Demo();
//     d.price = 12;
//     System.out.println(d.price);
//     Demo1.printPrice(d);
//   }
// }
class Demo{
protected int price;
   int pid;
 
}
class Demo1 extends Demo{
  void display(){
    System.out.println(price);
  }
}
 
class DefaultModifier{
  public static void main(String args[]){
    Demo1 d=new Demo1();
    d.price=12;
    d.display();
  }
}