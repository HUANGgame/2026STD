public class AP14 {
    static void show_MS() {
        MS p1 = new MS(5, 30);
        System.out.println("p1:" + p1);

        p1.addS(50);
        System.out.println("p1:" + p1);

        MS p2 = new MS(2, 40);
        System.out.println("p1:" + p1 + ", p2:" + p2);

        p2 = p2.mul2();
        System.out.println("p1:" + p1 + ", p2:" + p2);

        MS p3 = p1.add(p2);
        p1.incS();
        System.out.println("p1:" + p1 + ", p2:" + p2 + ", p3:" + p3);
    }

    static void test_MS() {
        System.out.println("--- test_MS ---");

        show_MS();
    }

    public static void main(String[] args) {
        show_MS();
    }
}
