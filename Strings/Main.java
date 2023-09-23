package Strings;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        String a = "Hello"; // Java String pool
        String a1 = "Hello";
        System.out.println(a.equals(a1));
        System.out.println(a == a1);

        String b = new String("Hello"); // Java Heap pool
        String b1 = new String("Hello");
        System.out.println(b.equals(b1));
        System.out.println(b == b1);

        String c = "Hello";
        c.concat("World");
        System.out.println(c);
        System.out.println(c.concat("World"));

        String d = "Hello";
        d = d + "World";
        System.out.println(d);

        // == reference comparison (Memory adress)
        // equals() content comparison (Value comparison)

        String name = "  Tunc  ";
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.substring(2, 7));
        System.out.println(name.substring(2));
        System.out.println(name.trim());
        System.out.println(name.indexOf("Tunc"));
        System.out.println(name.codePointAt(2));
        System.out.println(name.codePointBefore(3));
        System.out.println(name.codePointCount(2, 7));
        System.out.println(name.compareTo("Tunc"));
        System.out.println(name.compareToIgnoreCase("tunc"));
        System.out.println(name.contains("c"));
        System.out.println(name.concat("Engineer"));
        System.out.println(name.replace("u", "a"));
        System.out.println(name.contentEquals("tunc"));
        System.out.println(name.endsWith("  "));
        System.out.println(name.equals("Tunc"));
        System.out.println(name.replaceAll("  ", "-"));
        
        String name2 = "Hello@World@!";
        System.out.println(Arrays.toString(name2.split("@")));

        System.out.println(name.equalsIgnoreCase("  tunc  "));
        System.out.println(name.indent(10));
        System.out.println(name.toCharArray());
        System.out.println(String.join("/", "25","06","1940"));
        System.out.println(name.isBlank());
        System.out.println(name.isEmpty());
        System.out.println(name.repeat(3));
        String regex = "^[0-9]+$";
        System.out.println("123".matches(regex));
        System.out.println("123a".matches(regex));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.getClass());

        
        
    }
}