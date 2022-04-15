package JavaInterviewPrograms;

public class MissingNumberinArray {
    public static void main(String[] args) {
        int a[] ={1,2,3,4,5,7,8,9};
        int sum1=0;
        for(int i=0;i<a.length;i++){
            sum1=sum1+a[i];
        }
        System.out.println("Sum Of Range Of Elements in Array : " + sum1);

        int sum2=0;
        for(int i=1;i<=9;i++){
            sum2=sum2+i;
        }
        System.out.println("Sum Of Range Of Elements in Array : " + sum2);
        System.out.println("Missing number  in Array :  " + (sum2-sum1));
    }
}
