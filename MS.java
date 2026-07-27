class MS {
    int m;
    int s;

    MS(int m0, int s0) {
        this.m = m0;
        this.s = s0;
        adjust();
    }

    void adjust() {
        if (m < 0 || s < 0) {
            return;
        }

        m = m + s / 60;
        s = s % 60;
    }

    void addS(int ds) {
        s = s + ds;
        adjust();
    }

    void incS() {
        addS(1);
    }

    void reset() {
        m = 0;
        s = 0;
    }

    MS mul2() {
        MS ans = new MS(m * 2, s * 2);
        ans.adjust();
        return ans;
    }

    MS add(MS t2) {
        MS ans = new MS(m + t2.m, s + t2.s);
        ans.adjust();
        return ans;
    }

    String toStr() {
        return m + "m" + s + "s";
    }

    public String toString() {
        return m + "m" + s + "s";
    }
}
