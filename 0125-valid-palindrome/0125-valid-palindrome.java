class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase();
        s1 = s1.replaceAll("[^a-zA-Z0-9]","");
        int n = s1.length();
        for(int i = 0;i<n/2;i++){
            if(s1.charAt(i) != s1.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}