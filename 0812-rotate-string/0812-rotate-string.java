class Solution {
    public boolean rotateString(String s, String goal) {
        if (s == null || goal == null || s.length() != goal.length()) {
            return false;
        }
        if (s.equals(goal)) {
            return true;
        }
        // move characters, one at a time, and compare
        StringBuffer sb = new StringBuffer(s);
        for (char c : s.toCharArray()) {
            sb.deleteCharAt(0);
            sb.append(c);
            if (sb.toString().equals(goal)) {
                return true;
            }
        }
        return false;
    }
}