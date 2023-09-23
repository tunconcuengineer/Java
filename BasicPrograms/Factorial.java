package BasicPrograms;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(6));
    }
    public static int factorial(int number){
        int val = 1;
        while(number>0){
            val *= number;
            number--;
        }
        return val;
    }
}
