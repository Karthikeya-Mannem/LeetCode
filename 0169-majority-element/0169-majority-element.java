import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        Scanner scan = new Scanner(System.in);
        int n = nums.length;
        for(int i = 0;i<nums.length;i++){
            int rep = 0;
            for(int j = 0;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    rep++;
                }
            }
            if(rep > n/2){
              return nums[i];
            }
        }
        return -1;
    }
}