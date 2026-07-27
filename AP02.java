public class AP02 {
    public static void pm(char c, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }

    public static int pw(int x, int n) {
        int ans = 1;

        for (int i = 0; i < n; i++) {
            ans = ans * x;
        }

        return ans;
    }

    public static void main(String[] args) {
        pm('A', 5);
        System.out.println();

        System.out.println(pw(10, 3));

        for (int i = 1; i <= 5; i++) {
            System.out.print(pw(2, i));
            if (i < 5) {
                System.out.print(" ");
            }
        }
    }
}
