public class AP01 {
    public static void print(String s) {
        System.out.print(s);
    }

    public static String build(int n, String s) {
        String ans = "";

        for (int i = 0; i < n; i++) {
            ans = ans + s;
        }

        return ans;
    }

    public static void main(String[] args) {
        print(build(5, "ab"));
        print("\n");

        for (int i = 4; i <= 7; i++) {
            print(build(i, "c"));
            print("\n");
        }
    }
}
