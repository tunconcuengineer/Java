package OOP.Inheritance;

public class Plane extends Bird{

    private int wheels;
    private int doors;
    private int engines;
    

    public Plane(int height, int weight, int speed, boolean canFly, boolean hasWings, int wheels, int doors,
            int engines) {
        super(height, weight, speed, canFly, hasWings);
        this.wheels = wheels;
        this.doors = doors;
        this.engines = engines;
    }

    

    public int getWheels() {
        return wheels;
    }



    public void setWheels(int wheels) {
        this.wheels = wheels;
    }



    public int getDoors() {
        return doors;
    }



    public void setDoors(int doors) {
        this.doors = doors;
    }



    public int getEngines() {
        return engines;
    }



    public void setEngines(int engines) {
        this.engines = engines;
    }



    public void getFuel(){
        System.out.println("Fuel tank is full");
    }
    public void openDoors(){
        System.out.println("Opening doors");
    }



    @Override
    public String toString() {
        return "Plane [height=" + height + ", weight=" + weight + ", speed=" + speed + ", canFly=" + canFly
                + ", hasWings=" + hasWings + ", wheels=" + wheels + ", doors=" + doors
                + ", enginers=" + engines +"]";
    }




    

    
}
