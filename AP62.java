public class AP62 extends AP61 {
    static void step2() {
        if (L1.tail != null) {
            Node_XY first = L1.tail.next;
            Node_XY p = first;
            do {
                p.data.swap();
                p = p.next;
            } while (p != first);
        }

        System.out.println("\n--- step 2 ---");
        System.out.println("L1: " + L1);
    }

    public static void main(String[] args) {
        step1();
        step2();
    }
}
