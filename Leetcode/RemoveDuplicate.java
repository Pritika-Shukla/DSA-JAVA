
public class RemoveDuplicate {
   
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int k = 1; // Count for unique elements
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        
        return k;
    }

    public static void main(String[] args) {
        RemoveDuplicate remover = new RemoveDuplicate();

        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5, 6, 6, 7};
        int newLength = remover.removeDuplicates(nums);

        System.out.println("New Length: " + newLength);
        System.out.print("Updated Array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
