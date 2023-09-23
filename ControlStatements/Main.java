package ControlStatements;

public class Main {
    public static void main(String[] args) {
        int age = 18;
        if(age<8){
            System.out.println("Toddler");
        }else if(age >= 8 && age < 13){
            System.out.println("Kid");
        }else if(age >= 13 && age < 18){
            System.out.println("Teenager");
        }else if(age >= 18 && age < 25){
            System.out.println("Youngblood");
        }else if(age >= 25 && age < 45){
            System.out.println("Adult");
        }else{
            System.out.println("Elderly");
        }

        for(int i=0;i<10;i++){
            System.out.println("Start counting :"+i);
        }

        int i=9;
        while(i>=0){
            System.out.println("Start counting :"+i);
            i--;
        }

        i=9;
        do{
            System.out.println("Start counting :"+i);
            i--;
        }while(i>=0);

        char value = 'c';

        switch(value){
            case 'a':System.out.println("First letter");break;
            case 'b':System.out.println("Second letter");break;
            case 'c':System.out.println("Third letter");break;
            default:System.out.println("Provide valid character");
        }

        for(int j=0;j<10;j++){
            if(j%2 == 0){
                continue;
            }
            System.out.println("Odd numbers :"+j);
        }
        for(int j=0;j<10;j++){
            if(j == 5){
                break;
            }
            System.out.println("Print as long as j is Five :"+j);
        }

        int number = 12;
        switch(number){
            case 10 -> System.out.println("10");
            case 11 -> System.out.println("11");
            case 12 -> System.out.println("12");
            case 13 -> System.out.println("13");
        }

        boolean condition = true;
        int k = 10;
        while(condition){
            System.out.println("Value of k :"+k);
            if(k<=0){
                condition=false;
            }
            k--;

        }

    }
}
