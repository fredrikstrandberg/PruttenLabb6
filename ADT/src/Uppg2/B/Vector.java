package Uppg2.B;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

class Vector<E extends Comparable<E>> extends TreeMap<Integer, E> implements SparseVec<E> {


    //ska implementeras av TreeMap eller kombineras i SparseVec:
    //size(), minIndex(), maxIndex(), removeAt(pos), get(pos), removeElem(elem), add(pos,elem)

    //public int size() {return size();}

    public int minIndex() {
        if(!isEmpty()){
            return firstKey();
        }
        return -1;
    }
    public int maxIndex() {
        if(!isEmpty()){
            return lastKey();
        }
        return -1;
    }
    public void removeAt(int pos) {remove(pos);}

    //public E get(int pos) {return get(pos);}

    public void removeElem(E elem) { // borde kunna göras om lättare!!
        for(int i=0; i<maxIndex()+1;i++){
            if(get(i) == elem){
                remove(i);
            }
        }
    }
    public void add(int pos, E elem) {put(pos, elem);}

    //behöver implementeras här:
    //add(elem), indexOf(elem), toString(), toArray(), sortedValues()
    public void add(E elem) {
        int pos = 0;
        while(get(pos) != null){
            pos++;
        }
        put(pos, elem);
    }

    public int indexOf(E elem) {
        for(int i=0; i<maxIndex()+1;i++){
            if(get(i) == elem){
                return i;
            }
        }
        return -1;
    }

    public Object[] toArray() {
        Object[] obj = new Object[maxIndex()+1];
        for(int i=0; i<maxIndex()+1;i++){
            obj[i] = get(i);
        }
        return obj;
    }

    public List<E> sortedValues() {
        List<E> list = new ArrayList<>();
        Object[] keys = keySet().toArray();
        for (Object key : keys) {
            list.add(get(key));
        }
        return list;
    }

    public String toString() {
        Object[] objects = entrySet().toArray();
        StringBuilder returnString = new StringBuilder();
        for(Object obj : objects){
            returnString.append(obj).append("\n");
        }

        return returnString.toString();
    }
}