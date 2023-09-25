package OOP.Abstraction.AbsWithInterface;

public class Boat implements Vehicle{

    @Override
    public void accelerate() {
        System.out.println("Boat is going faster");
    }

    @Override
    public void brake() {
        System.out.println("Boat is slowing down");
    }
    
    
}
