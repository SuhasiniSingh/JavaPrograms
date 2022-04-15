package JavaInterviewPrograms;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the String : ");
        String str = sc.next();
        String org_st=str;
        String rev="";
        int len=str.length();
        for(int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
        System.out.println(org_st);
        if(org_st.equals(rev)){
            System.out.println(org_st + " is a Palindrome String ");
        }else{
            System.out.println(org_st + " is not a Palindrome String");
        }
    }
}
