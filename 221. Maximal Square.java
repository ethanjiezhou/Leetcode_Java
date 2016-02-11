public class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix == null)
            return 0;
        int m = matrix.length;
        if(m == 0)
            return 0;
        int n = matrix[0].length;
        int[][] result = new int[m+1][n+1];
        int max = 0;
        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                if(matrix[i-1][j-1] == '1') {
                    result[i][j] = Math.min(Math.min(result[i][j-1], result[i-1][j]), result[i-1][j-1]) + 1;
                    max = Math.max(max, result[i][j]);
                }
            }
        }
        return max * max;
    }
}