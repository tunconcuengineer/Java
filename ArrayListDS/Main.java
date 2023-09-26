package ArrayListDS;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.get(0));
        System.out.println(list.set(0, 5));
        System.out.println(list.contains(3));
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.size());
        Integer[] arr = new Integer[list.size()];
        list.toArray(arr);
        for(Integer i : arr){
            System.out.println(i);
        }
        

    }
}
