package JavaInterviewPrograms;

public class SumOfElementsInArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int sum=0;
       for(int i=0;i<=a.length-1;i++)//n=5;n-1=4;i<5 or i<=n-1
       {
            sum=sum+a[i];
        }
        System.out.println("sum of elements in Array : " + sum);

        //Enhanced for loop
        /*for(int value : a){
            sum=sum+value;
        }
        System.out.println("sum of elements in Array : " + sum);*/
    }
}
