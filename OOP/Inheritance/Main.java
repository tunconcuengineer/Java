package OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird(25, 10, 50, true, true);
        bird.takeOff();
        bird.speedUp();
        System.out.println(bird.toString());

        Plane plane = new Plane(4500, 50000, 700, true, true, 6, 4, 4);
        plane.takeOff();
        plane.speedUp();
        plane.openDoors();
        plane.getFuel();
        System.out.println(plane.toString());
    }
}
