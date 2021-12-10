
class NumberedItem<T> {
    int index;
    T value;

    NumberedItem(int i, T t) {
        this.index = Math.max(i, 0);
        this.value = t;
    }

    public int compareTo(int i2){
        return Math.abs(this.index - i2);
    }

    public String toString() {
        return "Index: " + String.valueOf(index) + " Value: " + value;
    }

}
