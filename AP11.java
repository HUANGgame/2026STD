public class AP11 {
    public static void main(String[] args) {
        sMS p1 = new sMS(5, 30);

        System.out.println(sMS.toStr(p1));

        sMS.incS(p1);

        System.out.println(sMS.toStr(p1));
    }
}
