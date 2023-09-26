package Collections.LinkedListDS;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Micheal");
        list.add("Jordan");
        list.add("Kobe");
        list.add("Bryant");
        list.add("Mike");
        list.add("Tyson");
        list.addFirst("Alex");
        list.addLast("Gandalf");
        System.out.println(list);
        System.out.println(list.contains("Gandalf"));
        System.out.println(list.get(2));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.offer("Brian");
        List<String> list2 = new LinkedList<>();
        list2 = list.subList(2, 4);
        System.out.println(list2);
        
    }
}
