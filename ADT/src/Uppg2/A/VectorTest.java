package Uppg2.A;

import static org.junit.Assert.*;

import java.util.*;
import org.junit.Before;
import org.junit.Test;

//ATT TESTA:
//public void add(E elem);           // add at lowest index >= 0 and not it use
//public void add(int pos, E elem);  // add elem at pos, if pos is occupied replace with elem, if pos<0 use index = 0
//public int indexOf(E elem);        // find first (lowest index) occurence of elem, return its index,
//// if not found, return -1
//public void removeAt(int pos);     // if index pos is not used, nothing happens
//public void removeElem(E elem);    // remove first occurence (lowest index) of elem
//public int size();
//public int minIndex();             // lowest index in use, if vector is empty return -1
//public int maxIndex();             // highest index in use, if vector is empty return -1
//public String toString();          // one line per element with index and value, sorted by index
//public E get(int pos);             // return null if not available
//public Object[] toArray();         // return the SparseVector as a regular array with value null at unused indexes
//public List<E> sortedValues();     // return a List of the values of the Vector in sorted order


public class VectorTest {
    Vector<String> emptyVec = new Vector<>();
    Vector<String> startStringVec = new Vector<>();
    Vector<Boolean> startBoolVec = new Vector<>();
    Vector<Integer> startIntVec = new Vector<>();

    @Before
    public void setupMaps() {
        startStringVec.add(1, "Kalle");
        startStringVec.add(10, "Pelle");
        startStringVec.add(5, "Anders");
        startStringVec.add("Per");
        startStringVec.add("Håkan");

        startBoolVec.add(1, true);
        startBoolVec.add(10, false);
        startBoolVec.add(5, false);
        startBoolVec.add(true);
        startBoolVec.add(false);

        startIntVec.add(1, 201);
        startIntVec.add(10, 312);
        startIntVec.add(5, 1);
        startIntVec.add(33);
        startIntVec.add(-10);
    }

    @Test
    public void testEmptyVec() {
        assertEquals(0, emptyVec.size());
        assertEquals(-1, emptyVec.minIndex());
        assertEquals(-1, emptyVec.maxIndex());

        assertNull(emptyVec.get(100));

        System.out.println(startStringVec);
        System.out.println(Arrays.toString(emptyVec.toArray()));
        System.out.println(emptyVec.sortedValues());

    }

    @Test
    public void testAddRemove() {
        //test addPos
        Vector<String> map = startStringVec;
        assertEquals(map.size(), 5);
        assertEquals(map.maxIndex(), 10);
    }
}
