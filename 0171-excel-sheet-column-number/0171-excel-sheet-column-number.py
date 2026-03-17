class Solution:
    def titleToNumber(self, columnTitle: str) -> int:
        result = 0
        power = 0

        for i in range(len(columnTitle) - 1, -1, -1):
            value = ord(columnTitle[i]) - ord('A') + 1
            result += value * (26 ** power)
            power += 1

        return result