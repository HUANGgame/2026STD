public class AP12 {
    public static void main(String[] args) {
        sMS p1 = new sMS(5, 30);
        System.out.println("p1:" + sMS.toStr(p1));

        sMS.addS(p1, 50);
        System.out.println("p1:" + sMS.toStr(p1));

        sMS p2 = new sMS(2, 40);
        System.out.println("p1:" + sMS.toStr(p1) + ", p2:" + sMS.toStr(p2));

        p2 = sMS.mul2(p2);
        System.out.println("p1:" + sMS.toStr(p1) + ", p2:" + sMS.toStr(p2));

        sMS p3 = sMS.add(p1, p2);
        sMS.incS(p1);
        System.out.println("p1:" + sMS.toStr(p1) + ", p2:" + sMS.toStr(p2) + ", p3:" + sMS.toStr(p3));
    }
}
