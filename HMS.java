class HMS extends MS {
    int h;

    HMS(int h0, int m0, int s0) {
        super(m0, s0);
        h = h0;
        adjustHM();
    }

    void adjustHM() {
        if (h < 0 || m < 0 || s < 0) {
            return;
        }

        h = h + m / 60;
        m = m % 60;
    }

    public String toString() {
        return h + "h" + m + "m" + s + "s";
    }

    void reset() {
        h = 0;
        m = 0;
        s = 0;
    }

    HMS mul2() {
        HMS ans = new HMS(h * 2, m * 2, s * 2);
        ans.adjustHM();
        return ans;
    }

    void addS(int intS) {
        s = s + intS;
        adjust();
        adjustHM();
    }

    HMS add(MS t2) {
        System.out.println("// execute HMS::add(MS).");
        int h2 = 0;
        if (t2 instanceof HMS) {
            h2 = ((HMS)t2).h;
        }

        HMS ans = new HMS(h + h2, m + t2.m, s + t2.s);
        ans.adjustHM();
        return ans;
    }

    HMS add(HMS t2) {
        System.out.println("// execute HMS::add(HMS).");
        HMS ans = new HMS(h + t2.h, m + t2.m, s + t2.s);
        ans.adjustHM();
        return ans;
    }
}
