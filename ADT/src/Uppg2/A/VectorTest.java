package Uppg2.A;

import static org.junit.Assert.*;

import org.junit.Test;

public class VectorTest {

    @Test
    //För en tom SparseVec, testa size(), minIndex(), maxIndex() som ju alla ska ge heltalsvärden.
    //Testa get(k), där k är ett godtyckligt int-värde. Anropa toArray() och sortedValues() på tom vektor och gör lämpliga tester på resultaten.
    public void testEmptyVec() {
        Vector<String> emptyVec = new Vector<>();

        assertEquals(0, emptyVec.size());
        assertEquals(-1, emptyVec.minIndex());
        assertEquals(-1, emptyVec.maxIndex());

        assertNull(emptyVec.get(100));
        assertEquals(0, emptyVec.toArray().length);
        assertEquals(0, emptyVec.sortedValues().size());
    }

    @Test
    //Lägg till element på specificerade positioner, några på samma index och testa size() efter varje insättning.
    //Testa värdena på minIndex() och maxIndex().
    public void testAddSpecIndex() {
        Vector<String> stringVec = new Vector<>();

        stringVec.add(10, "VectorElem1");
        assertEquals(1, stringVec.size());

        stringVec.add(4, "VectorElem2");
        assertEquals(2, stringVec.size());

        assertEquals(10, stringVec.maxIndex());
        assertEquals(4, stringVec.minIndex());

        stringVec.add(10, "VectorElem3");
        assertEquals(2, stringVec.size());

        stringVec.add(0, "VectorElem4");
        assertEquals(3, stringVec.size());

        assertEquals(10, stringVec.maxIndex());
        assertEquals(0, stringVec.minIndex());
    }

    @Test
    //Lägg till element på ospecificerad position.
    //Testa size() och get() så att det stämmer med förväntade värden.
    //Kom ihåg att testa get() med ett index som inte används. Den ska gå ge null.
    public void testAdd() {
        Vector<String> stringVec = new Vector<>();

        stringVec.add("VectorElem1");
        stringVec.add("VectorElem2");
        stringVec.add("VectorElem3");
        stringVec.add("VectorElem4");

        assertEquals(4, stringVec.size());
        assertEquals("VectorElem3", stringVec.get(2));
        assertNull(stringVec.get(4));
    }


    @Test
    //Testa båda varianterna av remove och gör tester som visar att de fungerar.
    public void testAddRemove() {
        Vector<String> stringVec = new Vector<>();
        stringVec.add("VectorElem1");
        stringVec.add("VectorElem2");
        stringVec.add("VectorElem3");
        stringVec.add("VectorElem4");

        assertEquals("VectorElem2", stringVec.get(1));
        stringVec.removeAt(1);
        assertNull(stringVec.get(1));

        stringVec.removeElem("VectorElem4");
        assertNull(stringVec.get(3));
        assertEquals(2, stringVec.size());
    }


}
