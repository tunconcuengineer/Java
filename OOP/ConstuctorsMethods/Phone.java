package OOP.ConstuctorsMethods;

public class Phone {
    int manuYear;
    String model;
    double price;

    public Phone(int manuYear,String model,double price){
        this.manuYear = manuYear;
        this.model = model;
        this.price = price;
    }
    @Override
    public String toString(){
        return "[Phone manufactured in :"+manuYear+"\nPhone model :"+model+
        "\nPhone price :"+price+"]";
    }
    public void mute(){
        System.out.println("Phone has been silenced");
    }
    public void playMusic(){
        System.out.println("Playing music..");
    }
    
}
