interface Operation{
  void add();
  void sub();
  void mul();
  void div();
}
class Calculator implements Operation{
 public void add(){
    int a=20,b=5;
    System.out.println((a+b));
  }
 public void sub(){
    int a=20,b=5;
    System.out.println((a-b));
  }
public void mul(){
    int a=20,b=5;
    System.out.println((a*b));
  }
 public void div(){
    int a=20,b=5;
    System.out.println((a/b));
  }
}
public class OperationInt{
  public static void main(String args[]){
    Operation op = new Calculator();
    op.add();
    op.sub();
    op.mul();
    op.div();
    
  }
}