class Solution {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int totalProduct = 1;
        int zeroCount = 0;

        // Count zeros & multiply non-zero numbers
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                totalProduct *= num;
            }
        }

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {

            if (zeroCount > 1) {
                result[i] = 0;  // more than one zero → all 0
            } 
            else if (zeroCount == 1) {
                if (nums[i] == 0) {
                    result[i] = totalProduct; // only zero index gets product
                } else {
                    result[i] = 0;
                }
            } 
            else {
                result[i] = totalProduct / nums[i]; // no zeros
            }
        }

        return result;
    }
}
