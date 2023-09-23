package BasicPrograms;


public class PalindromeString {
   public static void main(String[] args) {
    System.out.println(palindrome("ala"));
    System.out.println(palindrome("vikkiv"));
    System.out.println(palindrome("bull"));
   } 
   public static boolean palindrome(String text){
    String temp="";
    char temp2;
    for(int i=text.length()-1;i>=0;i--){
        temp2 = text.charAt(i);
        temp += temp2;
    }
    
    return text.equals(temp) ? true:false;
}}
