package JavaInterviewPrograms;

import java.util.HashSet;

public class DuplicatesElementinArray {
    public static void main(String[] args) {

        int a[] = {2,4,5,6,8,8,6};
        boolean flag = false;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i] == a[j]){
                    System.out.println("Duplicate elements found : " + a[i]);
                    flag=true;
                }
            }
        }if(flag==false){
            System.out.println("Duplicate Element not found");
        }
     //Approach 2:
        boolean flag1=false;
     String arr[] = {"java","c","c++","java","python"};
        HashSet<String> set = new HashSet<>();
        for(String lang : arr){
            if(set.add(lang) == false){
                System.out.println("Found Duplicate ekement " + lang);
                flag1=true;
            }
        }if(flag1==false){
            System.out.println("Duplicate elements not found ");
        }
    }
}
