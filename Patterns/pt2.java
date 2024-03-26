public class pt2 {

    public static void nForest(int n) {
        // Write your code
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void main(String args[]) {
        int n = 3;
        nForest(n);
    }
}

// *
// * *
// * * *