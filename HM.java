class HM implements MTime {
    int h;
    int m;

    HM(int h0, int m0) {
        h = h0;
        m = m0;
        adjust();
    }

    void adjust() {
        if (h < 0 || m < 0) {
            return;
        }

        h = h + m / 60;
        m = m % 60;
    }

    public void reset() {
        h = 0;
        m = 0;
    }

    public HM mul2() {
        return new HM(h * 2, m * 2);
    }

    public void addS(int ds) {
        m = m + ds / 60;
        adjust();
    }

    public HM add(MTime t2) {
        if (t2 instanceof HM) {
            HM p = (HM)t2;
            return new HM(h + p.h, m + p.m);
        }

        if (t2 instanceof HMS) {
            HMS p = (HMS)t2;
            return new HM(h + p.h, m + p.m + p.s / 60);
        }

        if (t2 instanceof MS) {
            MS p = (MS)t2;
            return new HM(h, m + p.m + p.s / 60);
        }

        throw new Error("Not expected type: " + t2.getClass());
    }

    public String toString() {
        return h + "h" + m + "m";
    }
}
