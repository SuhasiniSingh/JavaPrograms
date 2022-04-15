package javaprograms;

public class ReverseString2 {
    public static void main(String[] args) {
        //Method-1
        /*String s = "selenium";
        char ch[] = s.toCharArray();
        String rev = " ";
        for(int i=ch.length-1;i>=0;i--){
            rev=rev+ch[i];
        }
        System.out.println(rev);*/

        //Method-2
        String s ="selenium";
        int len = s.length();
        String rev=" ";
        for(int i=len-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);
    }
}
