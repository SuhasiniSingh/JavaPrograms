package JavaInterviewPrograms;

public class checkStringIsVowel {
    public static void main(String[] args) {
        String s1="precious";
      char[] ch=s1.toCharArray();
      char v[] ={'a','e','i','o','u'};
       int count=0;
     try {
    for (int i = 0; i < ch.length; i++) {
        for(int j=0;j<v.length;j++){
            if (ch[i] == v[j]){
                ch[i] ='#';
                count++;
            }
            }

    }if(count==0){
             System.out.println("vowels not found");
         }
     }catch(ArrayIndexOutOfBoundsException e){
    System.out.println(e);
    }
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }

     //method-2
     /*for(int i=0;i<ch.length;i++){

         if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'){
             ch[i] = '#';
         }
     }for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }*/
     //method-3
      /*  String str="cystal";
        System.out.println(str.replaceAll("[AaEeIiOoUu]","#"));*/
    }
    }
