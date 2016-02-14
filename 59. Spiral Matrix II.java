public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd =  n - 1;
        int value = 1;
        while(rowStart <= rowEnd && colStart <= colEnd) {
            for(int j = colStart; j <= colEnd; j++) {
                matrix[rowStart][j] = value++;
            }
            rowStart++;

            for(int i = rowStart; i <= rowEnd; i++) {
                matrix[i][colEnd] = value++;
            }
            colEnd--;

            if(rowStart <= rowEnd) {
                for(int j = colEnd; j >= colStart; j--) {
                    matrix[rowEnd][j] = value++;
                }
            }
            rowEnd--;

            if(colStart <= colEnd) {
                for(int i = rowEnd; i >= rowStart; i--) {
                    matrix[i][colStart] = value++;
                }
            }
            colStart++;
        }

        return matrix;
    }
}