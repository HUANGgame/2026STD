class sMS {
    int m;
    int s;

    sMS(int m0, int s0) {
        this.m = m0;
        this.s = s0;
    }

    static void adjust(sMS p) {
        if (p.m < 0 || p.s < 0) {
            return;
        }

        p.m = p.m + p.s / 60;
        p.s = p.s % 60;
    }

    static void addS(sMS p, int ds) {
        p.s = p.s + ds;
        adjust(p);
    }

    static void incS(sMS p) {
        addS(p, 1);
    }

    static sMS mul2(sMS t1) {
        sMS ans = new sMS(t1.m * 2, t1.s * 2);
        adjust(ans);
        return ans;
    }

    static sMS add(sMS t1, sMS t2) {
        sMS ans = new sMS(t1.m + t2.m, t1.s + t2.s);
        adjust(ans);
        return ans;
    }

    static String toStr(sMS p) {
        return p.m + "m" + p.s + "s";
    }
}
