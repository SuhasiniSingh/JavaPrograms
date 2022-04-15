package JavaInterviewPrograms;

public class FibonacciNumber {
    public static void main(String[] args) {
        int t1=0;
        int t2=1;
        int n=9;
        for(int i=0;i<=n;i++){
            System.out.print(t1 + " ");
            int sum=t1+t2;
            t1=t2;
            t2=sum;
        }

    }
}
