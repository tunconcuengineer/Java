package OOP.Inheritance;

public class Bird {
    protected int height;
    protected int weight;
    protected int speed;
    protected boolean canFly;
    protected boolean hasWings;

    


    public Bird(int height, int weight, int speed, boolean canFly, boolean hasWings) {
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.canFly = canFly;
        this.hasWings = hasWings;
    }
    
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean isHasWings() {
        return hasWings;
    }

    public void setHasWings(boolean hasWings) {
        this.hasWings = hasWings;
    }

    public void takeOff(){
        System.out.println("Bird is in the air");
    }
    public void speedUp(){
        System.out.println("Bird is speeding up");
    }

    @Override
    public String toString() {
        return "Bird [height=" + height + ", weight=" + weight + ", speed=" + speed + ", canFly=" + canFly
                + ", hasWings=" + hasWings + "]";
    }
    


    
}
