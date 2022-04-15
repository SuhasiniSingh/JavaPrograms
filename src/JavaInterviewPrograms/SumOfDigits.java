package JavaInterviewPrograms;

public class SumOfDigits {
    public static void main(String[] args) {
        int num=13412;
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum+=rem;
            num=num/10;
        }
        System.out.println("Sum of Digits in a Number : " + sum);
    }
}
