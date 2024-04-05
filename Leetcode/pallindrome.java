public class pallindrome {
    public static boolean isPalindrome(int x) {
        int originalNum = x;
        int reverse = 0;
        while (x > 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }
        return originalNum == reverse;
    }

    public static void main(String[] args) {
        int x = 1212;
        boolean result = isPalindrome(x);
        System.out.println("Is " + x + " a palindrome? " + result);
    }
}
