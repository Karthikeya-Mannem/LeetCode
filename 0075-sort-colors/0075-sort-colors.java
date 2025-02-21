class Solution {
    public void sortColors(int[] nums) {
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0){
                c1++;
            }else if(nums[i] == 1){
                c2++;
            }else{
                c3++;
            }
        }
        int idx = 0;
        for(int i = 0;i<c1;i++){
            nums[idx++] = 0;
        }
        for(int i = 0;i<c2;i++){
            nums[idx++] = 1;
        }
        for(int i = 0;i<c3;i++){
            nums[idx++] = 2;
        }
    }
}