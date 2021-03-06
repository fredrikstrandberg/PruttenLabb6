package Uppg2.A;

import java.util.*;

class Vector <E extends Comparable<E>> implements SparseVec<E> {

    TreeMap<Integer, E> map = new TreeMap<>();

    //I SparseVec-implementationens main-metod, skapa en vektor, lägg in minst fem värden.
    //Testa toString(), toArray() och sortedValues() genom att anropa dem och skriva ut resultaten.
    //Använd alltså inte JUnit och assert för dessa tester.
    public static void main(String[] args) {
        Vector<String> testVector = new Vector<>();
        testVector.add(4, "TestElem1");
        testVector.add(8, "TestElem2");
        testVector.add("TestElem3");
        testVector.add("TestElem4");
        testVector.add(1, "TestElem5");

        System.out.println(testVector);
        System.out.println(Arrays.toString(testVector.toArray()));
        System.out.println(testVector.sortedValues());
    }


    public int size() {return map.size();}
    public int minIndex() {
        if(!map.isEmpty()){
            return map.firstKey();
        }
        return -1;
    }
    public int maxIndex() {
        if(!map.isEmpty()){
            return map.lastKey();
        }
        return -1;
    }
    public void removeAt(int pos) {map.remove(pos);}
    public E get(int pos) {return map.get(pos);}
    public void removeElem(E elem) {
        for (Integer key : map.keySet()) {
            if(map.get(key) == elem)
                map.remove(key);
        }
    }
    public void add(int pos, E elem) {map.put(pos, elem);}


    public void add(E elem) {
        int pos = 0;
        while(get(pos) != null){
            pos++;
        }
        map.put(pos, elem);
    }

    public int indexOf(E elem) {
        for(Integer key : map.keySet()){
            System.out.println(elem);
            if(map.get(key) == elem){
                return key;
            }
        }
        return -1;
    }

    public Object[] toArray() {
        Object[] obj = new Object[maxIndex()+1];
        for(int i=0; i<maxIndex()+1;i++){
            obj[i] = map.get(i);
        }
        return obj;
    }

    public List<E> sortedValues() {
        List<E> list = new ArrayList<>();
        for (Integer key : map.keySet()) {
            list.add(map.get(key));
        }
        Collections.sort(list);
        return list;
    }

    public String toString() {
        StringBuilder returnString = new StringBuilder();
        for(Object obj : map.entrySet()){
            returnString.append(obj).append("\n");
        }

        return returnString.toString();
    }
}
