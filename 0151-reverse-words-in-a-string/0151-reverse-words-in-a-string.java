class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        String ans = "";
        StringBuilder s1 = new StringBuilder(s);
        s1.reverse();
        s = s1.toString();
        for(int i = 0;i<n;i++){
            String word = "";
            while(i < n && s.charAt(i) != ' '){
                word += s.charAt(i);
                i++;
            }
            StringBuilder s2 = new StringBuilder(word);
            s2.reverse();
            word = s2.toString();
            if(word.length() > 0){
                ans += " "+word;
            }
        }
        return ans.trim();
    }
}