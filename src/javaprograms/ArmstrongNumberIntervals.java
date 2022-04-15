package javaprograms;

public class ArmstrongNumberIntervals {
    public static void main(String[] args) {
        int low =1;
        int high = 155;
        int result=0;

            for(int i=low;i<high;i++) {
                int check=0;
                check = i;
                while (check != 0) {
                    int rem = check % 10;
                    result = result +(rem * rem * rem);
                    check = check / 10;
                }

                if (result == i) {
                    System.out.println(low + " is an Armstrong number");
                }
            }
    }
}
