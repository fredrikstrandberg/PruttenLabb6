package Uppg2.A;

import static org.junit.Assert.*;

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
    Vector<String> startStringMap = new Vector<>();
    Vector<Boolean> startBoolMap = new Vector<>();
    Vector<Integer> startIntMap = new Vector<>();
    @Before
    public void setupMap(){
        startStringMap.add(1, "Kalle");
        startStringMap.add(10, "Pelle");
        startStringMap.add(5, "Anders");
        startStringMap.add("Per");
        startStringMap.add("Håkan");

        startBoolMap.add(1, true);
        startBoolMap.add(10, false);
        startBoolMap.add(5, false);
        startBoolMap.add(true);
        startBoolMap.add(false);

        startIntMap.add(1, 201);
        startIntMap.add(10, 312);
        startIntMap.add(5, 1);
        startIntMap.add(33);
        startIntMap.add(-10);
    }


    @Test
    public void testAddElemPos() {
        Vector<String> map = startStringMap;
        assertEquals(map.size(), 5);
        assertEquals(map.maxIndex(), 10);
    }
    @Test
    public void testAddElem() {
        Vector<String> map = startStringMap;
    }
    @Test
    public void testIndexOf() {
        Vector<String> map = startStringMap;;
    }
    @Test
    public void testRemoveAt() {
        Vector<String> map = startStringMap;
    }
    @Test
    public void testRemoveElem() {
        Vector<String> map = startStringMap;
    }
    @Test
    public void testSize() {
        Vector<String> map = startStringMap;
    }
    @Test
    public void testMinIndex() {
        Vector<String> map = startStringMap;
    }
    @Test
    public void testMaxIndex() {
        Vector<String> map = startStringMap;
        assertEquals(map.maxIndex(), -1);   //om vektorn är tom ska -1 returneras
        map.add(1, "Kalle");
        map.add(10, "Pelle");
        map.add(5, "Anders");
        assertEquals(map.maxIndex(), 10);   //Pelle ligger på maxindex 10
        map.add("Håkan");
        map.add("Per");
        assertEquals(map.maxIndex(), 10);   //de nya borde läggas till på index 0 och 2, däför borde max vara samma
    }
    @Test
    public void testToString() {
        Vector<String> map = startStringMap;
    }
    @Test
    public void testGet() {
        Vector<String> map = startStringMap;
    }
    @Test
    public void testToArray() {
        Vector<String> map = startStringMap;
        Object[] objs = map.toArray();
        for(Object obj : objs){
            //System.out.println(obj);
        }
    }
    @Test
    public void testSortedValues() {
        Vector<String> map = startStringMap;
    }
}
