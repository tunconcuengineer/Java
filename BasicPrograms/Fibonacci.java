package BasicPrograms;

public class Fibonacci{
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int num3 = num1 + num2;
        while(num1 < 100){
            System.out.println(num1);
                num1 = num2;
                num2 = num3;
                num3 = num1 + num2;
        }
    }
}