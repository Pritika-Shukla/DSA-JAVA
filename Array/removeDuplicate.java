public class removeDuplicate {
    public static void main(String[] args) {
        int[] arr = {12, 34, 45, 45, 67, 77, 12, 12, 34};
        
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false; 
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.println(arr[i]);
            }
        }
    }
}
