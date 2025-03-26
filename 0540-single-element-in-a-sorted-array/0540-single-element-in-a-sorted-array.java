class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int ans = 0;
        if(n == 1){
            return nums[0];
        }
        for(int i = 0;i<n;i++){
            if(i == 0){
                if(nums[i] != nums[i+1]){
                    ans = nums[i];
                }
            }
            else if(i == n-1){
                if(nums[i] != nums[i-1]){
                    ans = nums[i];
                }
            }
            else{
                if(nums[i] != nums[i+1] && nums[i] != nums[i-1]){
                    ans = nums[i];
                }
            }
        }
        return ans;
    }
}