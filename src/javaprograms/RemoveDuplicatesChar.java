package javaprograms;

public class RemoveDuplicatesChar {
    public static void main(String[] args) {
        String str="automation";
        char[] chars= str.toCharArray();
        StringBuilder sb= new StringBuilder();
        boolean repeatedchars;
        for(int i=0;i<chars.length;i++){
            repeatedchars=false;
            for(int j=i+1;j<chars.length;j++){
                if(chars[i] == chars[j]){
                    repeatedchars=true;
                    break;
                }
            }
            if(!repeatedchars){
                sb.append(chars[i]);
            }
        }
        System.out.println(sb);
    }
}
