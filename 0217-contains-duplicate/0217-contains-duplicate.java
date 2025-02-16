class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> arr = new HashSet();
        for(int i = 0;i<nums.length;i++){
            arr.add(nums[i]);
        }

        if(arr.size() == nums.length){
            return false;
        }
        return true;
        }
}