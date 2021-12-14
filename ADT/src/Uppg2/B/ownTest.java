package Uppg2.B;

public class ownTest {

    public static void main(String[] args) {
        Vector<String> map = new Vector<>();
        map.add(0, "Kalle");
        System.out.println(map);

        map.add("Pelle");
        System.out.println(map);

        map.removeAt(0);
        System.out.println(map);
    }
}
