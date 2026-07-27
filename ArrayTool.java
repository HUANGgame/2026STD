public class ArrayTool {
    public static void print(float[] A, int s) {
        System.out.print("[ ");
        for (int i = 0; i < s; i++) {
            System.out.print(A[i] + ", ");
        }
        System.out.print("]");
    }

    public static void print(float[] A) {
        print(A, A.length);
    }

    public static void println(float[] A, int s) {
        print(A, s);
        System.out.println();
    }

    public static void println(float[] A) {
        print(A);
        System.out.println();
    }

    public static float[] copy(float[] A) {
        float[] ans = new float[A.length];
        for (int i = 0; i < A.length; i++) {
            ans[i] = A[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        float[] A = { 1.0f, 2.0f, 3.0f };
        println(A);
        println(A, 2);
        float[] B = copy(A);
        println(B);
    }
}
