class CLList_XY {
    Node_XY tail;

    CLList_XY() {
        tail = null;
    }

    CLList_XY(XY[] arr) {
        this();
        for (int i = 0; i < arr.length; i++) {
            append(arr[i]);
        }
    }

    void append(XY v) {
        if (tail == null) {
            tail = new Node_XY(v, null);
            tail.next = tail;
        } else {
            tail.next = new Node_XY(v, tail.next);
            tail = tail.next;
        }
    }

    @Override
    public String toString() {
        String ans = "[ ";
        if (tail != null) {
            Node_XY p = tail.next;
            do {
                ans = ans + p.data + ", ";
                p = p.next;
            } while (p != tail.next);
        }
        return ans + "]";
    }
}
