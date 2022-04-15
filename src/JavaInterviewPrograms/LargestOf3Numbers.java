package JavaInterviewPrograms;

import java.util.Scanner;

public class LargestOf3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter First Number  ");
        int a=sc.nextInt();
        System.out.println("Please Enter Second Number  ");
        int b=sc.nextInt();
        System.out.println("Please Enter Third Number  ");
        int c=sc.nextInt();

        if(a>b && a>c){
            System.out.println("a is the largest number ");
        }
        else if(b>a && b>c){
            System.out.println("b is the largest number");
        }
        else{
            System.out.println("c is the largest number");
        }
    }
}
