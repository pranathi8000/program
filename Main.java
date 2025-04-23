class Vehicle {

    public void startEngine()
    {
        System.out.println("Vehicle engine started");
    }
    
}
class Car extends Vehicle{

}
public class Main{
    public static void main(String[]args){
        Car myCar=new Car();
        myCar.startEngine();
    }
}
