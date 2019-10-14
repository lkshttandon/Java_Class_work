import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class JavaT1 {

    public static void main(String args[]){

        //Write a Java program to associate the specified value with the specified key in a Tree Map

        TreeMap<Integer,String> trmap=new TreeMap<>();
        trmap.put(1, "Red");
        trmap.put(2, "Green");
        trmap.put(3, "Black");
        trmap.put(4, "White");
        trmap.put(5, "Blue");

        for (Map.Entry<Integer,String> entry : trmap.entrySet())
        {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        //Write a Java program to copy a Tree Map content to another Tree Map.
        TreeMap<Integer,String> treemap2 = new TreeMap<>();
        treemap2.put(6, "Orange");
        treemap2.put(7, "Pink");
        System.out.println("\nTree Map 2: "+treemap2);
        trmap.putAll(treemap2);
        System.out.println("After copying map2 to map1: "+trmap+ "\n");

        //Write a Java program to search a key in a Tree Map.
        if(trmap.containsKey(2)){
            System.out.println("The Tree Map contains key '2'");
        } else {
            System.out.println("The Tree Map does not contain key'2'");
        }
        if(trmap.containsKey(8)){
            System.out.println("The Tree Map contains key '8'");
        } else {
            System.out.println("The Tree Map does not contain key '8'");
        }

        //Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.
        System.out.println("Checking the entry for 1: ");
        System.out.println("Value is: " + trmap.floorEntry(1));
        System.out.println("Checking the entry for 3: ");
        System.out.println("Value is: " + trmap.floorEntry(3));

        //Write a Java program to get a reverse order view of the keys contained in a given map.
        System.out.println("Reverse order view of the keys: " + trmap.descendingKeySet());

        //Write a Java program to get the portion of a map whose keys are strictly less than a given key.
        System.out.println("Checking the entry for 3: ");
        System.out.println("Key(s): " + trmap.headMap(3));
        System.out.println("Checking the entry for 8: ");
        System.out.println("Key(s): " + trmap.headMap(8));

        //Write a Java program to get the portion of a map whose keys range
        //from a given key (inclusive), to another key (exclusive).
        SortedMap< Integer, String > treemap3 = new TreeMap <> ();
        treemap3 = trmap.subMap(2,4);
        System.out.println("Sub map key-values: " + treemap3);
    }
}
