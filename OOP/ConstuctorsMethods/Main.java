package OOP.ConstuctorsMethods;

public class Main {
    
    public static void main(String[] args) {
        Phone myPhone = new Phone(2022, "Android", 1050);
        System.out.println(myPhone.toString());
        myPhone.mute();
        myPhone.playMusic();
    }
}
