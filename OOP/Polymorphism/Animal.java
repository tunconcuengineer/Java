package OOP.Polymorphism;

public class Animal {
    private double weight;

    
    public Animal(double weight) {
        this.weight = weight;
    }

    

    public void makeSound(){
        System.out.println("Animal is making sound");
    }
    public void eat(){
        System.out.println("Animal is eating");
    }



    public double getWeight() {
        return weight;
    }



    public void setWeight(double weight) {
        this.weight = weight;
    }
}
