package javaprograms;

public class ReverseString {

    public static void main(String[] args) {
        String s ="I love Java";
        String str[] = s.split(" ");
        String rev = " ";
        for(int i=str.length-1;i>=0;i--){
            rev += str[i]+" ";

        }
        System.out.println("Reverse String : " + rev);
    }

}
