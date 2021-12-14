package Uppg2.B;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
    Vector<String> stringMap = new Vector<>();
    Vector<Integer> intMap = new Vector<>();

    @Before
    public void setupMaps() {
        stringMap.add(1, "Kalle");
        stringMap.add(10, "Pelle");
        stringMap.add(5, "Anders");
        stringMap.add("Per");
        stringMap.add("Håkan");

        intMap.add(10);
        intMap.add(8);
        intMap.add(10, 25);
    }


    @Test
    public void testAddElemPos() {
        System.out.println(stringMap);
        System.out.println(intMap);

//        assertEquals(stringMap.size(), 5);
//        assertEquals(stringMap.maxIndex(), 10);
//
//        assertEquals(intMap.size(), 3);
//        assertEquals(intMap.maxIndex(), 10);
    }
}
//    @Test
//    public void testAddElem() {
//
//    }
//    @Test
//    public void testIndexOf() {
//        Vector<String> map = new Vector<>();
//    }
//    @Test
//    public void testRemoveAt() {
//        Vector<String> map = new Vector<>();
//    }
//    @Test
//    public void testRemoveElem() {
//        Vector<String> map = new Vector<>();
//    }
//    @Test
//    public void testSize() {
//        Vector<String> map = new Vector<>();
//    }
//    @Test
//    public void testMinIndex() {
//        Vector<String> map = new Vector<>();
//    }
//    @Test
//    public void testMaxIndex() {
//        Vector<String> map = new Vector<>();
//        assertEquals(map.maxIndex(), -1);   //om vektorn är tom ska -1 returneras
//        map.add(1, "Kalle");
//        map.add(10, "Pelle");
//        map.add(5, "Anders");
//        assertEquals(map.maxIndex(), 10);   //Pelle ligger på maxindex 10
//        map.add("Håkan");
//        map.add("Per");
//        assertEquals(map.maxIndex(), 10);   //de nya borde läggas till på index 0 och 2, däför borde max vara samma
//    }
//    @Test
//    public void testToString() {
//        Vector<String> map = new Vector<>();
//    }
//    @Test
//    public void testGet() {
//        Vector<String> map = new Vector<>();
//    }
//    @Test
//    public void testToArray() {
//        Vector<String> map = new Vector<>();
//        Object[] objs = map.toArray();
//        for(Object obj : objs){
//            //System.out.println(obj);
//        }
//    }
//    @Test
//    public void testSortedValues() {
//    }
//}
