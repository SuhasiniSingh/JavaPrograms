package javaprograms;

public class LargestNumber {
    public static void main(String[] args) {
        int x=1000;
        int y=1000;
        int z=700;

        if(x>y && x>z){
            System.out.println("x is the largest number");
        }
        else if(y>z){
            System.out.println("y is the largest number");
        }
        else{
            System.out.println("z is the largest number");
        }
    }
}
