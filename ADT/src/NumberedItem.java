
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

    public String toString() {
        return "Index: " + String.valueOf(index) + " Value: " + String.valueOf(value);
    }

}
