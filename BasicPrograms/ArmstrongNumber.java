package BasicPrograms;

public class ArmstrongNumber{
    public static void main(String[] args) {
        System.out.println(armstrong(153));
        System.out.println(armstrong(982));
        System.out.println(armstrong(1634));
        System.out.println(armstrong(9));
        System.out.println(armstrong(371));
        System.out.println(armstrong(381));
    }
    public static boolean armstrong(int number){
        int digits = getDigits(number);
        int temp2 = number;
        int sum = 0;
        int temp = 0;
        while(number>0){
            temp = number % 10;
            number /= 10;
            sum += Math.pow(temp, digits);
        }
        return temp2 == sum ? true : false;
    }

    public static int getDigits(int number){
        int digits = 0;
        while(number > 0){
            number /= 10;
            digits++;
        }
        return digits;
    }
}