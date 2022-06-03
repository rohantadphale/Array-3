// Time Complexity : O(n) n is length of nums
// Space Complexity : O(1) in place swapping
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Your code here along with comments explaining your approach: reverse 1. entire array 2. first section till k. 3. reverse second part

public class RotateArray {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return;
        int n = nums.length;

        if (k > n)
            k = k % n;
        rev(nums, 0, n - 1);
        rev(nums, 0, k - 1);
        rev(nums, k, n - 1);
    }

    private void rev(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
