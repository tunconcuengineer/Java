package WrapperClass;

public class Main {
    public static void main(String[] args) {

        int number = 15;
        Integer number2 = number;
        System.out.println(number2);
        
        
        String str = "123534";
        int num = Integer.parseInt(str);
        System.out.println(num);

        Integer num2 = Integer.valueOf("0011", 10);
        System.out.println(num2);
        Integer num3 = Integer.valueOf("0011", 2);
        System.out.println(num3);

        Float objectValue = 5.12F;
        int intValue = objectValue.intValue();
        System.out.println(intValue);

        




    }
    
}
