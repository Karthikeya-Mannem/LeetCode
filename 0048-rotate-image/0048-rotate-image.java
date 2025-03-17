import java.util.Arrays;
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0;i<=n-2;i++){
            for(int j = i+1;j<=n-1;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0;i<n;i++){
            reverse(matrix[i]);
        }
    }
    private void reverse(int row[]){
            int start  = 0;
            int end = row.length-1;
            while(start < end){
                int temp = row[end];
                row[end] = row[start];
                row[start] = temp;
                start++;
                end--;
            }
        }
}