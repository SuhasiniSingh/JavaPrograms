package javaprograms;

public class Factorialnumber {
    public static void main(String[] args) {
        //5!=5*4*3*2*1=n(n-1)
        int num=4;
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;//1 2 6
            System.out.println(fact);
        }
        System.out.println("factorial of " + num + " is equal to " + fact);
        System.out.println("-----while loop");
        int k=1;
        int f=1;
        while(k<=num){
            f=f*k;
            k++;
        }
        System.out.println(f);
    }
}
