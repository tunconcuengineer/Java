package Exceptions;

public class Main {
    public static void main(String[] args) {
        try {
            int num = 5;
            int num2 = 0;
            System.out.println(num/num2);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }finally{
            System.out.println("End of try-catch");
        }

        System.out.println("Continue..");

        try {
            int[] arr = new int[5];
            arr[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }finally{
            System.out.println("End of try-catch");
        }
        System.out.println("Continue..");

        


    }
}
