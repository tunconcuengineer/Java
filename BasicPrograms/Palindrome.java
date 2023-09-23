package BasicPrograms;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(12));
        System.out.println(palindrome(1221));
        System.out.println(palindrome(53));
        System.out.println(palindrome(121));
    }
    public static boolean palindrome(int number){
        int reversed = 0;
        int tempNumber = number;
        while(tempNumber > 0){
            int temp = tempNumber % 10;
            tempNumber /= 10;
            reversed *= 10;
            reversed += temp;
        }
        if(number == reversed){
            return true;
        }
        
        return false;
    }
}
