package JavaInterviewPrograms;

public class EvenOddfromArray {
    public static void main(String[] args) {
        int a[] = {2,4,3,7,6,8,9,10};
        System.out.println("Even numbers are ....");
        for(int i=0;i<a.length;i++){
            if(a[i]%2 == 0){
                System.out.println(a[i]);
            }
        }
        System.out.println("Odd numbers are ....");
        for(int i=0;i<a.length;i++){
            if(a[i]%2 != 0){
                System.out.println(a[i]);
            }
        }
    }
}
