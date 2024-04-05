public class twoSum {
    public static int[] TwoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 4,7, 11, 15 };
        int target = 9;
        int[] result = TwoSum(nums, target);

        if (result != null) {
            System.out.println("Indices of the two numbers whose sum is equal to the target:");
            System.out.println("[" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found.");
        }
    }
}
