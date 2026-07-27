public class AP54 extends AP53 {
    static void step4() {
        Node_XY tail = L2.head;
        while (tail.next != null) {
            tail = tail.next;
        }

        for (Node_XY p = L1.head; p != null; p = p.next) {
            L2.insAfter(tail, p.data);
            tail = tail.next;
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
