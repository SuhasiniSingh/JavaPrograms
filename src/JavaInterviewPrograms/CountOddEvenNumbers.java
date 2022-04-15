package JavaInterviewPrograms;

import java.util.Scanner;

public class CountOddEvenNumbers {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Please Enter Numbers : ");
       int num = sc.nextInt();
       // int num=12386;
        int even=0;
        int odd=0;
        while(num>0){
            int n=num%10;

            if(n%2==0){
               //System.out.print(n + " is an even numbers " );
                even++;

            }else{
                //System.out.print(n + " is a odd numbers");
                odd++;
            }
            num=num/10;
        }
        System.out.println(even + " Total Even numbers");
        System.out.println(odd + " Total Odd numbers");
    }
}
