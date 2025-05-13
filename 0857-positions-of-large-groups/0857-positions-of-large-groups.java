class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
         List<List<Integer>> res = new ArrayList<>();

        int len = s.length();
        if (len < 3) {
            return res;
        }

        char[] chs = s.toCharArray();
        int preIdx = 0;
        for (int i = 1; i <= len; i++) {
            if (i == len || chs[i] != chs[i - 1]) {
                if (i - preIdx >= 3) {
                    res.add(Arrays.asList(preIdx, i - 1));
                }

                preIdx = i;
            }
        }

        return res;
    }
}