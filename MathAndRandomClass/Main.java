package MathAndRandomClass;

import java.util.Random;

public class Main{
    public static void main(String[] args) {
        int num = 5;
        int num2 = 10;

        System.out.println(Math.min(num, num2));
        System.out.println(Math.max(num, num2));
        System.out.println(Math.abs(num2));
        System.out.println(Math.sqrt(num2));
        System.out.println(Math.pow(num, num2));
        System.out.println(Math.E);
        System.out.println(Math.PI);

        Random random = new Random();
        
        System.out.println(random.nextInt(10));
        System.out.println(random.nextDouble(5));
        System.out.println(random.nextBoolean());
        System.out.println(random.nextFloat(2,4));
        System.out.println(random.nextDouble()*100);
        

    }
}