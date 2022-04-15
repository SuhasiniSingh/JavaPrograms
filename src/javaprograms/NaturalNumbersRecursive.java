package javaprograms;

public class NaturalNumbersRecursive {
    public static void main(String[] args) {

        int num=3;
        int sum = addNum(num);
        System.out.println("recursive natural number  " + sum);
    }
    public static int addNum(int num){
        if(num!=0){
            return num + addNum(num-1);
        }
        else{
            return num;
        }
    }
}
