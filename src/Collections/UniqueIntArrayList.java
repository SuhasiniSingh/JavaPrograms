package Collections;

import java.util.ArrayList;

public class UniqueIntArrayList {
    public static void main(String[] args) {
        int a[] = {3,4,4,1,4,2,2,3};
        ArrayList<Integer> ab= new ArrayList<Integer>();
        for(int i=0;i<a.length;i++){
            int k=0;
            if(!ab.contains(a[i])){
                ab.add(a[i]);
                k++;
                for(int j=i+1;j<a.length;j++){
                    if(a[i] == a[j]){
                        k++;
                    }
                }
                System.out.println(a[i]);
                System.out.println(k);
                if(k==1){
                    System.out.println(a[i] + "is a unique number");
                }
            }

        }



    }
}
