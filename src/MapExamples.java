import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeMap;

public class MapExamples {
    public static void main(String[] args)
    {
        //HashMap allows the user to enter key and value pairs
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Fred","705-555-1234");
        hashMap.put("Betty","416-123-3333");
        hashMap.put("Barney","905-555-9876");

        System.out.println(hashMap);

        //access the values by using the keys
        for (String key:hashMap.keySet())
            System.out.printf("key: %-10s value: %s%n",
                                              key, hashMap.get(key));


        //to guarentee that the elements will be added in order
        //use a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Big 10");
        treeMap.put(5, "Medium");
        treeMap.put(2, "Espresso");

        System.out.println("TreeMap: "+treeMap);

        TreeMap<String, LinkedList> contacts = new TreeMap<>();

    }
}
