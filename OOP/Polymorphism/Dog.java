package OOP.Polymorphism;

public class Dog extends Animal{

    private String breed;
    public Dog(String breed,double weight) {
        super(weight);
        this.breed = breed;
    }

    

    @Override
    public void makeSound() {
        System.out.println("Dog is making sound");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }



    public String getBreed() {
        return breed;
    }



    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    



    
}
