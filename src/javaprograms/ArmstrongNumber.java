package javaprograms;

public class ArmstrongNumber {
    public static void main(String[] args) {
       int num=153;
       int actuaNum=num;
       double result=0;
       while(num!=0){
          int n= num % 10;
          result = result + Math.pow(n,3);
          num = num/10;
       }
       if(actuaNum == result){
           System.out.println(actuaNum + " is an Armstrong number");
       }else{
           System.out.println("It's not an Armstrong number");
       }

    }
}
