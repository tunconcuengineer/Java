package OOP.ConstuctorsMethods.ConstructorChaining;

public class Main {

    Main(){
        this(3);
        System.out.println("Default constructor");
        }
    Main(int x){
        this(x,15);
        System.out.println(x);
    }
    Main(int x,int y){
        System.out.println(x+y);
    }
    public static void main(String[] args) {
        new Main();
        
    }
}
