package Uppg2;

import static org.junit.Assert.*;

import org.junit.Test;

public class VectorTest {

    @Test
    public void testAdd() {
        Vector<String> map = new Vector<>();
        map.add(1, "Kalle");
        map.add(2, "Pelle");

        assertEquals(map.size(), 2);

    }

    @Test
    public void testEquals() {

    }
}
