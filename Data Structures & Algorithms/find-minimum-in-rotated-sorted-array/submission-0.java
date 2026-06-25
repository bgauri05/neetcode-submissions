//Figure out which half is sorted. If one half is sorted, 
//the minimum cannot be hidden inside that sorted half (except possibly at its first element, 
//which we've already compared with res). So search the other half.

class Solution {
    public int findMin(int[] nums) {

        // Left pointer
        int l = 0;

        // Right pointer
        int r = nums.length - 1;

        // Assume first element is the minimum
        int res = nums[0];

        while (l <= r) {

            // If the current search space is already sorted,
            // then the leftmost element is the minimum.
            if (nums[l] < nums[r]) {
                res = Math.min(res, nums[l]);
                break;
            }

            // Find middle
            int m = l + (r - l) / 2;

            // Update minimum with middle element
            res = Math.min(res, nums[m]);

            // Check if LEFT HALF is sorted
            if (nums[m] >= nums[l]) {

                // Left half is sorted.
                // Minimum cannot be inside this sorted half.
                // Search the right half.
                l = m + 1;

            } else {

                // Right half is sorted.
                // Rotation point (minimum) lies in the left half.
                r = m - 1;
            }
        }

        return res;
    }
}