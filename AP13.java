public class AP13 {
    public static void main(String[] args) {
        MS p1 = new MS(5, 30);
        System.out.println("p1:" + p1.toStr());

        p1.addS(50);
        System.out.println("p1:" + p1.toStr());

        MS p2 = new MS(2, 40);
        System.out.println("p1:" + p1.toStr() + ", p2:" + p2.toStr());

        p2 = p2.mul2();
        System.out.println("p1:" + p1.toStr() + ", p2:" + p2.toStr());

        MS p3 = p1.add(p2);
        p1.incS();
        System.out.println("p1:" + p1.toStr() + ", p2:" + p2.toStr() + ", p3:" + p3.toStr());
    }
}
