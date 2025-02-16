class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int total_rows = grid.length;
        int total_cols = grid[0].length;
        int rows =  0;
        int cols = total_cols-1;
        while(rows < total_rows && cols >=0){
            if(grid[rows][cols] < 0){
                cols--;
                count += total_rows-rows;
            }else{
                rows++;
            }
        }
        return count;
    }
}