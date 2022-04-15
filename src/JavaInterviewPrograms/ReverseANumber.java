package JavaInterviewPrograms;

public class ReverseANumber {
    public static void main(String[] args) {
        int n=1234;
        int rev=0;
        while(n!=0){
            int num=n%10;
            rev=(rev*10)+num;
            n=n/10;
        }
        System.out.println("Reversed number : " + rev);
    }
}
