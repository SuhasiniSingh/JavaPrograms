package JavaInterviewPrograms;

public class SwapTwoNumbers {

    public static void main(String[] args) {
     //swap two numbers without using temp variable
        int a=10;
        int b=20;
        System.out.println("Before swapping the value of a is  : " + a);
        System.out.println("Before swapping the value of b is  : " + b);
        a=a+b;//10+20=30;a=30
        b=a-b;//30-20=10;b=10
        a=a-b;//30-10=20;a=20

        System.out.println("After swapping the value of a is : " + a);
        System.out.println("After swapping the value of b is : " + b);



    }
}