package javaprograms;

import java.util.Scanner;

public class countUpperlowerChar {
    public static void main(String[] args) {
        String str;
        int upper=0,lower=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String...");
        str=scan.nextLine();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>'A' && ch<'Z'){
                upper++;
            }else if(ch>'a'&&ch<'z'){
                lower++;
            }
        }
        System.out.println("lowercase letters " + lower);
        System.out.println("uppercase letters " + upper);
    }
}
