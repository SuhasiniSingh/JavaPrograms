package JavaInterviewPrograms;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the number : ");
        int n=scan.nextInt();
        int rev=0;
        int actualnum=n;
        while(n!=0){
            int num = n%10;
            rev=(rev*10) + num;
            n=n/10;
        }
        if(actualnum == rev){
            System.out.println(actualnum + " is a Palindrome number..");
        }else{
            System.out.println(actualnum  + " is not a Palindrome number..");
        }

    }
}
