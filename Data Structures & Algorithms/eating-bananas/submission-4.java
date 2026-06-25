

class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        // Minimum possible eating speed
        int l = 1;

        // Maximum possible eating speed (largest pile)
        int r = Arrays.stream(piles).max().getAsInt();

        // Store the minimum valid speed found so far
        int res = r;

        // Binary search on the eating speed
        while (l <= r) {

            // Middle speed to test
            int k = l + (r - l) / 2;

            // Calculate total hours needed if Koko eats at speed k
            long totalTime = 0;

            for (int p : piles) {
                // Hours needed for one pile
                // ceil(p / k) because even a fraction of an hour counts as a full hour
                totalTime += Math.ceil((double) p / k);
            }

            // If Koko can finish within h hours
            if (totalTime <= h) {

                // k is a possible answer
                res = k;

                // Try to find a smaller valid speed
                r = k - 1;

            } else {

                // k is too slow
                // Search for a larger speed
                l = k + 1;
            }
        }

        // Return the minimum speed that works
        return res;
    }
}