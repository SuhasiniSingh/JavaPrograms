package JavaInterviewPrograms;

import java.util.Scanner;

public class CountwordsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");//Welcome to java world
        String str=sc.nextLine();
         int count=1;
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')){
                count++;
            }
        }
        System.out.println("Total number of words in a string :  " + count);
    }
}
