package javaprograms;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num =1331;
        int rev=0;
        int actualnum = num;
        while(num!=0){
            int n= num % 10;
            rev=rev*10 + n;
            num=num/10;
        }
        System.out.println("palindrome number is " + rev);

        if(actualnum == rev){
            System.out.println(actualnum  + " is a palindrome number");
        }else{
            System.out.println("Is not a palindrome number");
        }
    }
}
