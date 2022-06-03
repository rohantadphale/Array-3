// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Your code here along with comments explaining your approach: 2 pointer approach with tracking max of left and right

public class TrapRainWater {
    public int trap(int[] height) {
        if (height == null || height.length == 0)
            return 0;

        int left = 0, right = height.length - 1;
        int lmax = 0, rmax = 0;
        int res = 0;

        while (left < right) {
            if (height[left] > lmax)
                lmax = height[left];
            if (height[right] > rmax)
                rmax = height[right];
            if (lmax < rmax) {
                res += Math.max(0, lmax - height[left]);
                left++;
            } else {
                res += Math.max(0, rmax - height[right]);
                right--;
            }
        }
        return res;
    }
}
