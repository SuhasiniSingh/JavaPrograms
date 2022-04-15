package javaprograms;

public class PowerConcept {

    public static void main(String[] args) {
        int base =2;
        int exponent =2;
         long res=1;

         while(exponent!=0){
             res*=base;
             exponent--;
         }
        System.out.println(res);
    }
}
