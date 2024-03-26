public class pt3 {

    public static void nTriangle(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 5;
        nTriangle(n);
    }
}

// 1
// 12
// 123
// 1234