package javaprograms;

import java.util.Arrays;
import java.util.Scanner;

public class InterviewPrograms {
   /* public static void isAnagram(String str1,String str2){
        String s1=str1.replaceAll("\\s", " ");
        String s2=str2.replaceAll("\\s"," ");

        boolean status=true;
        if(s1.length()!=s2.length()){
            status = false;
        }else{
            char[] Arrays1=s1.toLowerCase().toCharArray();
            char[] Arrays2=s2.toLowerCase().toCharArray();
            Arrays.sort(Arrays1);
            Arrays.sort(Arrays2);
            status=Arrays.equals(Arrays1,Arrays2);
        }
        if(status){
            System.out.println(s1 + " and " + s2 + " are anagrams");
        }else{
            System.out.println(s1  + " and " + s2  + " are not Anagrams");
        }

    }*/

    public static void main(String[] args) {
       int n=5;
       boolean flag=false;
       for(int i=2;i<=n/2;i++) {
           if (n % i == 0) {
               flag = true;
               break;
           }
       }
           if(!flag){
               System.out.println(n + " is a prime number");
           }else{
               System.out.println(n + " is not a prime number");
           }


    }
}