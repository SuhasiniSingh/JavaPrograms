package javaprograms;

public class Positive_NegativeNumber {
    public static void main(String[] args) {
        double num = 12.33;//double can hold int or decimals
        if(num > 0){
            System.out.println(num + "is a positive number");
        }
        else if (num< 0){
            System.out.println(num + "is a negative number");
        }
        else{
            System.out.println(num + "is equals to zero");
        }
    }
}
