package Uppg2;

import static org.junit.Assert.*;

import org.junit.Test;

public class VectorTest {

    @Test
    public void testAdd() {
        Vector<String> map = new Vector<>();
        map.add(1, "Kalle");
        map.add(10, "Pelle");
        map.add(5, "Anders");

        assertEquals(map.size(), 3);
        assertEquals(map.maxIndex(), 10);
        System.out.println(map.sortedValues());

        Object[] objs = map.toArray();
        for(Object obj : objs){
            System.out.println(obj);
        }

        System.out.println(map);
    }

    @Test
    public void testEquals() {

    }
}
