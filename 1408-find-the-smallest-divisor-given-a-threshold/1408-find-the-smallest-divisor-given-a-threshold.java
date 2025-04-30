class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1, high = 0;

        // Find the maximum value in the array to set the upper bound
        for (int num : nums) {
            if (num > high) high = num;
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (sumByDivisor(nums, mid) <= threshold) {
                high = mid - 1; // try smaller divisor
            } else {
                low = mid + 1; // need larger divisor
            }
        }

        return low;
    }

    private int sumByDivisor(int[] nums, int divisor) {
        int sum = 0;
        for (int num : nums) {
            // Equivalent to Math.ceil(num / divisor)
            sum += (num + divisor - 1) / divisor;
        }
        return sum;
    }
}
