package Scanners;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name");
        String name = sc.nextLine();
        System.out.println("Please enter your age");
        int age = sc.nextInt();
        System.out.println("Welcome "+name+".You are "+age+" years old");
        sc.nextLine();
        String username;
        String password;
        do{
            System.out.println("Enter your username");
            username = sc.nextLine();
            System.out.println("Enter your password");
            password = sc.nextLine();

        }while(!username.equals("Java") && !password.equals("Oak"));

        sc.close();
    }
}
