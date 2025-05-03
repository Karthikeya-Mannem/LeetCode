class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int left1 = 0, left2 = 0, sum1 = 0, sum2 = 0, right = 0, result = 0;
        int n = nums.length;
              while (right < n) {
            sum1 += nums[right];
            sum2 += nums[right];
          
            while (left1 <= right && sum1 > goal) {
                sum1 -= nums[left1++];
            }
          
            while (left2 <= right && sum2 >= goal) {
                sum2 -= nums[left2++];
            }
          
            result += left2 - left1;
          
            ++right;
        }
              return result;
    }
}