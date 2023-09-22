package Variables;

public class Main {
    public static void main(String[] args) {
        byte byteNumber = 10;
        short shortNumber = 32;
        int intNumber = 214;
        long longNumber = 516L;
        float floatNumber = 54.35F;
        double doubleNumber = 127.86541;
        char charValue = 'T';
        boolean booleanValue = true;
        String stringValue = "Java";

        System.out.println("ByteNumber holds the value of :"+byteNumber);
        System.out.println("ShortNumber holds the value of :"+shortNumber);
        System.out.println("IntNumber holds the value of :"+intNumber);
        System.out.println("LongNumber holds the value of :"+longNumber);
        System.out.println("FloatNumber holds the value of :"+floatNumber);
        System.out.println("DoubleNumber holds the value of :"+doubleNumber);
        System.out.println("CharValue holds the value of :"+charValue);
        System.out.println("BooleanValue holds the value of :"+booleanValue);
        System.out.println("StringValue holds the value of :"+stringValue);

        System.out.println("Minimum value a byte type variable can hold :"+Byte.MIN_VALUE);
        System.out.println("Maximum value a byte type variable can hold :"+Byte.MAX_VALUE);
        System.out.println("Minimum value a short type variable can hold :"+Short.MIN_VALUE);
        System.out.println("Maximum value a short type variable can hold :"+Short.MAX_VALUE);
        System.out.println("Minimum value a int type variable can hold :"+Integer.MIN_VALUE);
        System.out.println("Maximum value a int type variable can hold :"+Integer.MAX_VALUE);
        System.out.println("Minimum value a long type variable can hold :"+Long.MIN_VALUE);
        System.out.println("Maximum value a long type variable can hold :"+Long.MAX_VALUE);
        System.out.println("Minimum value a float type variable can hold :"+Float.MIN_VALUE);
        System.out.println("Maximum value a float type variable can hold :"+Float.MAX_VALUE);
        System.out.println("Minimum value a double type variable can hold :"+Double.MIN_VALUE);
        System.out.println("Maximum value a double type variable can hold :"+Double.MAX_VALUE);
        System.out.println("Minimum value a char type variable can hold :"+Character.MIN_VALUE);
        System.out.println("Maximum value a char type variable can hold :"+Character.MAX_VALUE);
        System.out.println("Boolean variables can hold only true or false");
        System.out.println("String can hold from 0 characters to "+Integer.MAX_VALUE+" characters");
        
        System.out.println("Size of byte is :"+Byte.SIZE +" bytes");
        System.out.println("Size of short is :"+Short.SIZE +" bytes");
        System.out.println("Size of int is :"+Integer.SIZE +" bytes");
        System.out.println("Size of long is :"+Long.SIZE +" bytes");
        System.out.println("Size of float is :"+Float.SIZE +" bytes");
        System.out.println("Size of double is :"+Double.SIZE +" bytes");
        System.out.println("Size of char is :"+Character.SIZE +" bytes");
        System.out.println("Size of boolean isn't specified by Java");
        System.out.println("Size of String is dependent on String length");

          


    }
}
