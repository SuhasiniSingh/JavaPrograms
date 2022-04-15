package JavaInterviewPrograms;

public class BinarySearch {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int key=5;
        int low=0;
        int high=a.length-1;
        boolean flag=false;
       while(low<=high){
           int mid=(low+high)/2;
           if(a[mid]==key){
               System.out.println("Element found..." );
               flag=true;
               break;
           }
           if(a[mid]<key){
               low=mid+1;
           }
           if(a[mid]>key){
               high=mid-1;
           }

       } if(flag==false){
            System.out.println("Element NOT found..");
        }
    }
}
