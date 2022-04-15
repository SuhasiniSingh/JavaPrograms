package javaprograms;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int num=100;
        int sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;//1
            //System.out.println(sum);
        }
        System.out.println(sum);
        System.out.println("-------");

        int k=1;
        int sum1=0;
        while(k<=num){
            sum1=sum1+k;
            k++;
        }
        System.out.println(sum1);



    }
}
