class Overload {
  void overl(int a) {
    System.out.println("a: " + a);
  }

  void overl(int a, int b) {
    System.out.println("a and b:" + a + "," + b);
  }

  double overl(double a) {
    System.out.println("double a:" + a);
    return a * a;
  }
}

class PloymoDemoOverload {
  public static void main(String args[]) {
    Overload Over = new Overload();
    double result;
    Over.overl(10);
    Over.overl(10, 20);
    result = Over.overl(5.5);
    System.out.println("Returned output:" + result);
  }
}