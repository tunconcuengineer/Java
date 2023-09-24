package OOP.ClassesObjects;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.manuYear = "2017";
        car.speed = 120;
        System.out.println("Car manufactured in :"+car.manuYear+"\nSpeed: "+car.speed);
    }
}
