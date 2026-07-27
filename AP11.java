class sMS {
    int m;
    int s;

    sMS(int m0, int s0) {
        this.m = m0;
        this.s = s0;
    }

    static void addS(sMS p, int ds) {
        p.s = p.s + ds;
    }

    static void incS(sMS p) {
        addS(p, 1);
    }

    static String toStr(sMS p) {
        return p.m + "m" + p.s + "s";
    }
}

public class AP11 {
    public static void main(String[] args) {
        sMS p1 = new sMS(5, 30);

        System.out.println(sMS.toStr(p1));

        sMS.incS(p1);

        System.out.println(sMS.toStr(p1));
    }
}
