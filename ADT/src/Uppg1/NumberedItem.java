package Uppg1;

class NumberedItem<T> {
    int index;
    T value;

    NumberedItem(int i, T t) {
        this.index = Math.max(i, 0);
        this.value = t;
    }

    public int compareTo(NumberedItem<T> obj){
        return this.index - obj.index;
    }

    public boolean equals(NumberedItem<T> obj){
        if(obj == null) { return false; }
        return this.index == obj.index;
    }

    public String toString() {
        return "Index: " + String.valueOf(index) + " Value: " + String.valueOf(value);
    }

}
