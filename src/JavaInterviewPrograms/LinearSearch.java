package JavaInterviewPrograms;

public class LinearSearch {
    public static void main(String[] args) {
        int a[] = {10,30,35,40,60};
        int search_key=35;
        boolean flag=false;
        for(int i=0;i<a.length;i++){
            if(a[i] == search_key){
                System.out.println("Element found at position " + i);
                flag=true;
                break;
            }
        }if(flag==false){
            System.out.println("Element NOT found...");
        }
    }
}
