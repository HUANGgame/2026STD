public class AP64 extends AP63 {
    static void step4() {
        if (L1.tail != null) {
            Node_XY first = L1.tail.next;
            Node_XY p = first;
            do {
                L2.append(p.data);
                p = p.next;
            } while (p != first);
        }

        System.out.println("\n--- step 4 ---");
        System.out.println("L2: " + L2);
    }

    public static void main(String[] args) {
        step1();
        step2();
        step3();
        step4();
    }
}
