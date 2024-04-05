

public class reverse {
    public int Reverse(int x) {
        int reverse = 0;
        while (x != 0) {
            int digit = x % 10;
            if ((reverse > Integer.MAX_VALUE / 10) || (reverse < Integer.MIN_VALUE / 10)) {
                return 0;
            }
            reverse = reverse * 10 + digit;
            x = x / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        reverse sol = new reverse();
        int x = 1253;
        int reversed = sol.Reverse(x);
        System.out.println("Reversed number: " + reversed);
    }
}
