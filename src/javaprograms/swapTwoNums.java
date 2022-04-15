package javaprograms;

public class swapTwoNums {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        /*int c =a;//10
        a=b;//20
        b=c;
        System.out.println("value of a after swap " + a);
        System.out.println("value of b after swap " + b);*/

        //without temp variable
        b=b-a;//10
        a=a+b;//20

        System.out.println("without temp variable value of a  " +  a);
        System.out.println("value of b " + b);


    }
}
