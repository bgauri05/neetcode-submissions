class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int left = 0;
        int right = numbers.length - 1;
        
        while (left < right) {
            
            int sum = numbers[left] + numbers[right];
            
            if (sum == target) {
                // Problem requires 1-based index
                return new int[]{left + 1, right + 1};
            } 
            else if (sum < target) {
                left++;   // need bigger sum
            } 
            else {
                right--;  // need smaller sum
            }
        }
        
        return new int[]{};  // guaranteed one solution, so usually not reached
    }
}