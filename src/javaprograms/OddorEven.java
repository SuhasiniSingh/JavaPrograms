package javaprograms;

import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("plz enter an integer : ");

        int num = reader.nextInt();

        if(num %2==0){
            System.out.println(num  + "is even number9");
        }else {
            System.out.println(num + "is odd number");
        }
    }
}
