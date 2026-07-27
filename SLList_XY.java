class SLList_XY {
    private static class Node {
        XY data;
        Node next;

        Node(XY v, Node n) {
            data = v;
            next = n;
        }
    }

    private Node head;

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
        head = new Node(v, head);
    }

    @Override
    public String toString() {
        String ans = "[ ";
        Node p = head;
        while (p != null) {
            ans = ans + p.data + ", ";
            p = p.next;
        }
        return ans + "]";
    }
}
