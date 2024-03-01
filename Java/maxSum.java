// Need to Study .. 

public class maxSum {
    public int maxSumSkipAdjacent(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        if (nums.length == 1)
            return Math.max(0, nums[0]);

        // Initialize the maximum sum including the current element and excluding the
        // current element
        int maxSumIncludingCurrent = 0;
        int maxSumExcludingCurrent = 0;

        for (int num : nums) {
            // If the current number is negative, it cannot help in maximizing the sum
            if (num < 0)
                continue;

            // The new max excluding the current number is the max of the previous two
            int newMaxExcludingCurrent = Math.max(maxSumIncludingCurrent, maxSumExcludingCurrent);

            // The new max including the current number is the max sum excluding the
            // previous number plus the current number
            maxSumIncludingCurrent = maxSumExcludingCurrent + num;

            // Update the max excluding current number to the new max
            maxSumExcludingCurrent = newMaxExcludingCurrent;
        }

        // The answer is the max of including or excluding the last number
        return Math.max(maxSumIncludingCurrent, maxSumExcludingCurrent);
    }

    public static void main(String[] args) {
        maxSum maxSum = new maxSum();
        int[] nums = { 2, -4, 5, 6, 7, 8, -5 };
        System.out.println(maxSum.maxSumSkipAdjacent(nums)); // Should print 16
    }
}
