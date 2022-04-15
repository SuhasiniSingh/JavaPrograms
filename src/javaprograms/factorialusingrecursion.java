package javaprograms;

public class factorialusingrecursion {
    public static void main(String[] args) {
        int num=5;
        System.out.println(" factorial of " + num + " using recursive " +  multiplyNum(num));
    }
    public static int multiplyNum(int num){
        if(num>=1){
            return num * multiplyNum(num-1);
        }else{
            return 1;
        }
    }
}
