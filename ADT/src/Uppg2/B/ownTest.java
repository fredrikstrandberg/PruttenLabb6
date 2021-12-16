package Uppg2.B;

import java.util.Arrays;

public class ownTest {

    public static void main(String[] args) {
        Vector<String> map = new Vector<>();
        Vector<Boolean> map2 = new Vector<>();
        Vector<Integer> map3 = new Vector<>();

        map2.add(true); map2.add(true); map2.add(false); map2.add(true); map2.add(true);
        map3.add(2); map3.add(4); map3.add(1); map3.add(55); map3.add(2); map3.add(3);
        System.out.println(map2.sortedValues());
        System.out.println(map3.sortedValues());


        map.add(0, "Kalle");
        System.out.println(map);

        System.out.println(Arrays.toString(map.toArray()));

        map.add("Pelle");
        map.add("Anders");
        System.out.println(map);

        System.out.println(map.sortedValues());

        map.removeAt(0);
        System.out.println(map);

        map.add("Kalle");
        map.add("Anders");
        map.add("Håkan");
        map.add("Per");
        map.add("Kim");
        map.add("Alex");
        System.out.println(map);

        map.removeElem("Håkan");
        System.out.println(map);

    }
}
