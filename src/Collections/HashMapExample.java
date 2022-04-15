package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> mp = new HashMap<>();
        //Hashtable<Integer,String> ht= new Hashtable<>();
        /*
        Hashtable is synchronized and thread safe whereas Hashmap is non synchronized and non thread safe(multiple thread can access this map simultaneously)
        Hashtable do not allow null keys or null values whereas Hashmap allows one null key and number of null values
        Hashtable and vector use enumerator interface to iterate the elements whereas Hashmap iterate elements using Iterator interface
         */
        mp.put(0,"hi");
        mp.put(1,"hello");
        mp.put(2,"bye");
        mp.put(3,"morning");
        mp.put(4,"morning");
        mp.put(5,"evening");
        mp.put(6,"evening");
        Set set=mp.entrySet();
       Iterator it = set.iterator();
       while(it.hasNext()){
           Map.Entry m=(Map.Entry)it.next();
           System.out.println(m);
       }

    }
}
