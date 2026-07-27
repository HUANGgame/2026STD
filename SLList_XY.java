class Node_XY {
    XY data;
    Node_XY next;

    Node_XY(XY v, Node_XY n) {
        data = v;
        next = n;
    }
}

class SLList_XY {
    Node_XY head;

    SLList_XY() {
        head = null;
    }

    SLList_XY(XY[] arr) {
        this();
        for (int i = arr.length - 1; i >= 0; i--) {
            prepend(arr[i]);
        }
    }

    void prepend(XY v) {
        head = new Node_XY(v, head);
    }

    void insAfter(Node_XY p, XY v) {
        p.next = new Node_XY(v, p.next);
    }

    @Override
    public String toString() {
        String ans = "[ ";
        Node_XY p = head;
        while (p != null) {
            ans = ans + p.data + ", ";
            p = p.next;
        }
        return ans + "]";
    }
}
