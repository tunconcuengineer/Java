package TypeCasting;

public class Main {
    public static void main(String[] args) {
        short shortNumber = 110;
        byte byteNumber = (byte) shortNumber;

        System.out.println("ShortNumber value :"+shortNumber);
        System.out.println("ByteNumber value :"+byteNumber);

        byte byteNumber2 = 96;
        short shortNumber2 = byteNumber2;

        System.out.println("ByteNumber2 value :"+byteNumber2);
        System.out.println("ShortNumber2 value :"+shortNumber2);

        int number = 15;
        double number2 = number;
        
        System.out.println("Value of number :"+number);
        System.out.println("Value of number2 :"+number2);

        number2 = 26;

        System.out.println("Value of number :"+number);
        System.out.println("Value of number2 :"+number2);




        String name = "Tunc";
        String name2 = name;

        System.out.println("Name value :"+name);
        System.out.println("Name2 value :"+name2);
        
        name = "Kagan";

        System.out.println("Name value :"+name);
        System.out.println("Name2 value :"+name2);

    }
}
