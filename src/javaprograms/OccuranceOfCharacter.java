package javaprograms;

public class OccuranceOfCharacter {
    public static void main(String[] args) {
        String str="aabbccddaauutaa";
        char search ='a';
        int count =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)== search)
                count++;
        }
        System.out.println(" The character " + search + " appears " + count + " times " );

    }
}
