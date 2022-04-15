package javaprograms;

import java.util.Scanner;

public class countalphaspecialcharacters {
    public static void main(String[] args) {
        int alpha=0,space=0,special=0,num=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the string : ");
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='A' && ch<='Z'||ch>='a'&& ch<='z'){
                alpha++;
            } else if(ch>='0'&& ch<='9'){
                num++;
            }else if(ch== ' '){
                space++;
            }else{
                special++;
            }
        }
        System.out.println("\n Alphabets letter :" + alpha);
        System.out.println("numbers : " + num);
        System.out.println("space : " + space);
        System.out.println("Special : " + special);
    }
}
