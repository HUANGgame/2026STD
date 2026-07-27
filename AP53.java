public class AP53 extends AP52 {
    static void step3() {
        L2 = new SLList_XY();

        L2.prepend(new XY(8, 11));
        Node_XY tail = L2.head;

        XY[] data = { new XY(8, 12), new XY(8, 13), new XY(8, 14) };
        for (int i = 0; i < data.length; i++) {
            XY v = data[i];
            L2.insAfter(tail, v);
            tail = tail.next;
        }

        System.out.println("\n--- step 3 ---");
        System.out.println("L2: " + L2);
    }

    public static void main(String[] args) {
        step1();
        step2();
        step3();
    }
}
