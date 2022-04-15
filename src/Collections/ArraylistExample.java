package Collections;

import java.util.ArrayList;

public class ArraylistExample {
    public static void main(String[] args) {
        ArrayList<String> a= new ArrayList<>();
        a.add("java");
        a.add("selenium");
        a.add("automation");
        a.add("restapi");
        a.add(1,"appium");
        System.out.println(a);
        System.out.println(a.get(0));
        System.out.println(a.indexOf("selenium"));
        //a.remove(2);
        System.out.println(a.contains("java"));
        System.out.println(a.size());
    }
}
