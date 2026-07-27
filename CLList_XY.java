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
            insAfter(tail, v);
        }
    }

    void insAfter(Node_XY p, XY v) {
        p.next = new Node_XY(v, p.next);
        if (p == tail) {
            tail = p.next;
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
