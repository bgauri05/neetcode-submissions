class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        // Answer array
        int[] res = new int[temperatures.length];

        // Stack stores {temperature, index}
        Stack<int[]> stack = new Stack<>();

        // Visit every day
        for (int i = 0; i < temperatures.length; i++) {

            // Current day's temperature
            int t = temperatures[i];

            // While:
            // 1. Stack is not empty
            // 2. Current temperature is warmer than the temperature
            //    on top of the stack
            while (!stack.isEmpty() && t > stack.peek()[0]) {

                // Remove the day that was waiting
                int[] pair = stack.pop();

                // pair[0] = old temperature
                // pair[1] = old index

                // Number of days waited
                res[pair[1]] = i - pair[1];
            }

            // Current day has not found a warmer day yet
            // Put it in the stack and let it wait
            stack.push(new int[]{t, i});
        }

        return res;
    }
}