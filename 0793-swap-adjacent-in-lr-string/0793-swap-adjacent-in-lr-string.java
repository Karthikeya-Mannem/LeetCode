class Solution {
    public boolean canTransform(String start, String result) {
        int n = start.length();
        int startIndex = 0;
        int endIndex = 0;
        while (startIndex < n || endIndex < n) {
            while (startIndex < n
                && start.charAt(startIndex) == 'X') { // find next valid letter in start
                startIndex++;
            }
            while (endIndex < n
                && result.charAt(endIndex) == 'X') { // find next valid letter in end
                endIndex++;
            }
            if (startIndex == n && endIndex == n) { // both reached the end
                return true;
            }
            if (startIndex == n || endIndex == n) { // different number of valid letters
                return false;
            }
            if (start.charAt(startIndex)
                != result.charAt(endIndex)) { // different valid letter
                return false;
            }
            if (start.charAt(startIndex) == 'R'
                && startIndex > endIndex) { // wrong direction
                return false;
            }
            if (start.charAt(startIndex) == 'L'
                && startIndex < endIndex) { // wrong direction
                return false;
            }
            startIndex++;
            endIndex++;
        }
        return true;

    }
}