package Enums;

public class Main {
    public static void main(String[] args) {
        Days var = Days.WEDNESDAY;

        switch(var){
            case MONDAY -> System.out.println("Monday");
            case TUESDAY -> System.out.println("Tuesday");
            case WEDNESDAY -> System.out.println("Wednesday");
            case THURSDAY -> System.out.println("Thursday");
            case FRIDAY -> System.out.println("Friday");
            case SATURDAY -> System.out.println("Saturday");
            case SUNDAY -> System.out.println("Sunday");
            default -> System.out.println("Enter valid day");
        }
    }
}
