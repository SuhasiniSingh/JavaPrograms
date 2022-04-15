package JavaInterviewPrograms;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number: ");
        int n = sc.nextInt();
        boolean flag=false;
        for(int i=2;i<=n/2;i++){
            if(n%i == 0){
                flag=true;
                break;
            }
        }if(flag == false){
            System.out.println("is a prime number");
        }else{
            System.out.println("It's not a prime number,please enter a number correctly ");
        }
    }
}
