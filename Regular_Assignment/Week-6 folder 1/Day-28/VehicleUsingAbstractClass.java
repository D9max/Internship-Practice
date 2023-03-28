//Write an abstract class "Vehicle" with an abstract method "start()" which will be implemented by its two subclasses "Car" and "Bike". Implement these classes and demonstrate how they start.
abstract class Vehicle{
  void start();
}
class Car extends Vehicle{
  void start(){
    System.out.println("car start");
  }
}

class Bike extends Vehicle{
  void start(){
    System.out.println("Bike start")
  }
}
public class VehicleUsingAbstractClass{
  public static void main(String args[]){
    Vehicle V = new Car();
    Vehicle V1 = new Bike();
    V.start();
    V1.start();
  }
}