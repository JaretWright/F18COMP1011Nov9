import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args)
    {
        LinkedList<String> linkedList = new LinkedList<>();
        ArrayList<String> arrayList = new ArrayList<>();

        linkedList.add("Frank");
        linkedList.add("George");
        linkedList.add("Annie");
        linkedList.add("Rosco");
        arrayList.add("Frank");
        arrayList.add("George");
        arrayList.add("Annie");
        arrayList.add("Rosco");

        System.out.println("LinkedList: "+linkedList);
        System.out.println("ArrayList: "+arrayList);


    }
}
