package OOP.ConstuctorsMethods.MethodOverload;

public class Main {
    public static void main(String[] args) {
        System.out.println(add(3, 5));
        System.out.println(add(3, 4, 5));
        System.out.println(add(3, 5));
        System.out.println(add(3, 4, 5));
    }
    public static int add(int x,int y){
        return x+y;
    }
    public static int add(int x,int y,int z){
        return x+y+z;
    }
    public static double add(double x,double y){
        return x+y;
    }
    public static double add(double x,double y,double z){
        return x+y+z;
    }

}
