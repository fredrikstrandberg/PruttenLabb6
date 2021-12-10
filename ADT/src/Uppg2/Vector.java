package Uppg2;

import java.util.List;
import java.util.TreeMap;

class Vector <E extends Comparable<E>> implements SparseVec<E>{


    TreeMap<Integer, E> map = new TreeMap<Integer, E>();

    //ska implementeras av TreeMap eller kombineras i SparseVec:
    //size(), minIndex(), maxIndex(), removeAt(pos), get(pos), removeElem(elem), add(pos,elem)

    public int size() {return map.size();}
    public int minIndex() {return 0;}               //inte implementerad
    public int maxIndex() {return 0;}               //inte implementerad
    public void removeAt(int pos) {map.remove(pos);}
    public E get(int pos) {return map.get(pos);}
    public void removeElem(E elem) {}               //inte implementerad
    public void add(int pos, E elem) {map.put(pos, elem);}


    //behöver implementeras här:
    //add(elem), indexOf(elem), toString(), toArray(), sortedValues()
    public void add(E elem) {

    }

    public int indexOf(E elem) {
        return 0;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public List<E> sortedValues() {
        return null;
    }

    public String toString() {
        return "Vector{" +      //har inte gjort detta, kom automatiskt
                "map=" + map +
                '}';
    }
}
