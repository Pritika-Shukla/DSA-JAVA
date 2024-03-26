public class pt12 {
    public static void iTriangle(int n) {
        int space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // spaces
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            space -= 2; // Decrease spaces for the next row

            // numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        iTriangle(4);
    }
}
