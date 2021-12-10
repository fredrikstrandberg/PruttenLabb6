public class ownTest {


    public static void main(String[] args) {
        NumberedItem<Integer> i1 = new NumberedItem<>(-1,1);
        NumberedItem<Integer> i2 = new NumberedItem<>(0,17);
        NumberedItem<Integer> i3 = new NumberedItem<>(5,100);
        NumberedItem<Integer> i4 = new NumberedItem<>(10,378);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i3.compareTo(i4));
    }


}
