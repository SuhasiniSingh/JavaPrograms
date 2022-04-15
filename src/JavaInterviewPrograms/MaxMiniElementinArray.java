package JavaInterviewPrograms;

public class MaxMiniElementinArray {
    public static void main(String[] args) {
        int a[] = {30,50,60,10,5,80,90};
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Maximum Element in Array is : " + max);

        int min=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("Minimum Element in Array is : " + min);
    }
}
