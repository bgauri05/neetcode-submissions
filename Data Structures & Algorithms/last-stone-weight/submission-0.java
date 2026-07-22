

class Solution {
    public int lastStoneWeight(int[] stones) {

        // Create a max heap (priority queue)
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // Add all stones to the priority queue
        for (int stone : stones) {
            pq.add(stone);
        }

        // Continue until only one (or zero) stone remains
        while (pq.size() > 1) {

            // Remove the two heaviest stones
            int y = pq.poll(); // largest
            int x = pq.poll(); // second largest

            // If they are different, add the remaining weight
            if (x != y) {
                pq.add(y - x);
            }
        }

        // Return the last remaining stone, or 0 if none
        return pq.isEmpty() ? 0 : pq.poll();
    }
}