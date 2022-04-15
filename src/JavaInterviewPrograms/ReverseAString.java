package JavaInterviewPrograms;

public class ReverseAString {
    public static void main(String[] args) {
        String s="selenium";
        int len=s.length();
        String rev="";
        //1st method:

       /* for(int i=len-1;i>=0;i--) {
          rev=rev+s.charAt(i);
        }
        System.out.println("Reverse String : " + rev );*/
       //2nd Method:

       char a[] = s.toCharArray();
       for(int i=len-1;i>=0;i--){
           rev=rev + a[i];
       }
        System.out.println("Reverse String : " + rev);

    }
}
