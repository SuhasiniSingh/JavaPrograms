package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        //Hashset,Treeset,LinkedHashset classes implements set interface
        //set interface doesn't allow duplicate values
        //No guarantee that elements stored in sequential order
        Set<String> hs = new HashSet<>();
        hs.add("INDIA");
        hs.add("USA");
        hs.add("UK");
        hs.add("UK");
        hs.add("ENGLAND");
        hs.add("INDIA");
        hs.add("AUSTRIA");

        System.out.println( hs.size());
        System.out.println( hs.isEmpty());
        System.out.println( hs.contains("UK"));
        //hs.remove("USA");
        System.out.println(hs);
        Iterator<String> it= hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
