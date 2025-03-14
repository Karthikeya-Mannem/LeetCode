class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;

        while(startrow <= endrow && startcol <= endcol){
            for(int j = startcol;j<=endcol;j++){
                ans.add(matrix[startrow][j]);
            }
            for(int i = startrow+1;i<=endrow;i++){
                ans.add(matrix[i][endcol]);
            }
            for(int j = endcol-1;j>=startcol;j--){
                if(startrow == endrow){
                    break;
                }
                ans.add(matrix[endrow][j]);
            }
            for(int i = endrow-1;i>startrow;i--){
                if(startcol == endcol){
                    break;
                }
                ans.add(matrix[i][startcol]);
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
        return ans;
    }
}