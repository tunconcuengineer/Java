package OOP.Abstraction.AbsWithClass;

public class Car extends Vehicle{

    @Override
    public void accelerate() {
        System.out.println("Car is speeding up");
    }

    @Override
    public void brake() {
        System.out.println("Car is slowing down");
    }

    @Override
    public void honk() {
        System.out.println("Car honks");
    }
    
    
}
