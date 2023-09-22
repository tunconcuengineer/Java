package Operators;

public class Main {
    public static void main(String[] args) {
        int number = 15;
        int number2 = 4;

        System.out.println("15 + 4 :"+(number+number2));
        System.out.println("15 - 4 :"+(number+number2));
        System.out.println("15 * 4 :"+(number*number2));
        System.out.println("15 / 4 :"+(number/number2));
        System.out.println("15 % 4 :"+(number%number2));
        

        double doubleNumber = 15;
        double doubleNumber2 = 4;

        System.out.println("15 + 4 :"+(doubleNumber+doubleNumber2));
        System.out.println("15 - 4 :"+(doubleNumber-doubleNumber2));
        System.out.println("15 * 4 :"+(doubleNumber*doubleNumber2));
        System.out.println("15 / 4 :"+(doubleNumber/doubleNumber2));

        byte byteNum = 0;

        System.out.println("Increase value by one :"+byteNum++);
        System.out.println("Value :"+byteNum);
        System.out.println("Increase value by one :"+ ++byteNum);
        System.out.println("Value :"+byteNum);

        System.out.println("Decrease value by one :"+byteNum--);
        System.out.println("Value :"+byteNum);
        System.out.println("Decrease value by one :"+ --byteNum);
        System.out.println("Value :"+byteNum);

        byteNum += 5;
        System.out.println("Add 5 :"+byteNum);
        byteNum -= 2;
        System.out.println("Subract 2 :"+byteNum);
        byteNum *= 3;
        System.out.println("Multiply with 3 :"+byteNum);
        byteNum /= 2;
        System.out.println("Divide with 2 :"+byteNum);

        int value = 3;
        byte value2 = 3;

        System.out.print("Is 3 equal to 3 ? :");
        System.out.println(value == value2);

        System.out.print("Is 3 not equal to 3? :");
        System.out.println(value != value2);

        System.out.println(value > value2 ? "3 is bigger than 3" : "3 is equal to 3");

        System.out.println(value >= value2 && value2 <= value);
        System.out.println(value >= value2 || value2 <= value);

        

        System.out.println(~5);
        System.out.println(~-6);

        boolean isTrue = true;

        System.out.println(isTrue);
        System.out.println(!isTrue);

        System.out.println("10 << 1 :"+(10<<1));
        System.out.println("10 << 2 :"+(10<<2));

        System.out.println("10 >> 1 :"+(10>>1));
        System.out.println("10 >> 2 :"+(10>>2));








    }
}
