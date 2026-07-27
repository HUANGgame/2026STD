public class AP63 extends AP62 {
    static void step3() {
        L2 = new CLList_XY();

        XY[] data = {
            new XY(8, 11),
            new XY(8, 12),
            new XY(8, 13),
            new XY(8, 14)
        };

        for (int i = 0; i < data.length; i++) {
            XY v = data[i];
            L2.append(v);
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
