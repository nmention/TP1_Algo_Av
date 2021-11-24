public class exo3 {

    public static void main(String[] args) {

        IntArray tab = new IntArray(5);
        tab.put(0,10);
        tab.put(1,20);
        tab.put(2,30);
        tab.put(3,40);
        tab.put(4,50);
        System.out.println(tab.toString());
        tab.remove(12);
        tab.remove(2);
        System.out.println(tab.toString());
        tab.insert(3,99);
        tab.insert(0,77);
        System.out.println(tab.toString());
    }
}
