import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        Scanner scan = new Scanner(System.in);
        int ans = 0;
        for(int i = 0;i<nums.length;i++){
        int rep = 0;
        for(int j = 0;j<nums.length;j++){
            if(nums[i] == nums[j] && i!=j){
                rep = 1;
                break;
            }
        }
        if(rep == 0){
            ans = nums[i];
            }
        }
        return ans;
    }
}