class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int original_num =  x;
        int reversed_num = 0;
        while(x != 0){
            reversed_num = reversed_num*10+x%10;
            x = x/10;
        }
        return original_num == reversed_num;
    }
}