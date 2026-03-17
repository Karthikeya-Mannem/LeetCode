class Solution:
    def makeSmallestPalindrome(self, s: str) -> str:
        s = list(s)   # strings are immutable → convert to list
        
        i = 0
        j = len(s) - 1
        
        while i < j:
            if s[i] != s[j]:
                smaller = min(s[i], s[j])
                s[i] = smaller
                s[j] = smaller
            i += 1
            j -= 1
        
        return "".join(s)