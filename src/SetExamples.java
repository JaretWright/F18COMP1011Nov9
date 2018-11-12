import java.util.*;

public class SetExamples {
    public static void main(String[] args)
    {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Great");
        hashSet.add("Awesome");
        hashSet.add("Brilliant");
        hashSet.add("Great");

        System.out.println("hashset: "+hashSet);

        List<String> list = Arrays.asList("The","Great","Wall",
                                                "The","Great","Wall");
        System.out.println("List: "+list);
        hashSet.addAll(list);

        System.out.println("Hashset with list: "+hashSet);

        //This example uses a TreeSet, which behaves like a HashSet
        //except the elements will be ordered by a Comparator
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Great");
        treeSet.add("Awesome");
        treeSet.add("Brilliant");
        treeSet.add("Great");

        System.out.println("TreeSet: "+treeSet);

        TreeSet<Excuse> bensExcuses = new TreeSet<>();
        Excuse excuse1 = new Excuse("flat tire", 3);
        bensExcuses.add(excuse1);
        bensExcuses.add(excuse1);
        bensExcuses.add(excuse1);
        bensExcuses.add(new Excuse("missed alarm", 6));
        bensExcuses.add(new Excuse("all night game session", 1));
        bensExcuses.add(new Excuse("flat tire", 8));
        bensExcuses.add(new Excuse("flat tire", 8));
        bensExcuses.add(new Excuse("making music too late", 3));
        bensExcuses.add(new Excuse("at interview", 10));

        System.out.println("\n\nTreeSet of excuses:");
        for(Excuse excuse:bensExcuses)
            System.out.println(excuse);



    }

}
