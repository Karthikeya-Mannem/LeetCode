class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        // Find the (n-k)th smallest element because the kth largest is also the (n-k)th smallest when sorted in ascending order
        return quickSelect(nums, 0, n - 1, n - k);
    }

    // Helper function to perform quick select
    private int quickSelect(int[] nums, int left, int right, int kSmallest) {
        // When the left and right pointers meet, we've found the kSmallest element
        if (left == right) {
            return nums[left];
        }

        // Initialize two pointers for the partitioning step
        int i = left - 1;
        int j = right + 1;
        // Choose pivot as the middle element
        int pivot = nums[(left + right) >>> 1];

        while (i < j) {
            // Move i right past any elements less than the pivot
            do {
                i++;
            } while (nums[i] < pivot);

            // Move j left past any elements greater than the pivot
            do {
                j--;
            } while (nums[j] > pivot);

            // Swap elements at i and j if they are out of order with respect to the pivot
            if (i < j) {
                swap(nums, i, j);
            }
        }

        // After partitioning, the pivot is now at index j
        // If we found the kSmallest element, return it
        if (j >= kSmallest) {
            return quickSelect(nums, left, j, kSmallest);
        }

        // Otherwise, continue the search in the right partition
        return quickSelect(nums, j + 1, right, kSmallest);
    }

    // Swap function to swap two elements in the array
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}