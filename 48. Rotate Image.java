public class Solution {
    public void rotate(int[][] matrix) {
        int i = 0;
        int j = matrix.length - 1;
        while(i < j) {
            int[] temp = matrix[i];
            matrix[i] = matrix[j];
            matrix[j] = temp;
            i++;
            j--;
        }

        for(int m = 1; m < matrix.length; m++) {
            for(int n = 0; n < m; n++) {
                int temp = matrix[m][n];
                matrix[m][n] = matrix[n][m];
                matrix[n][m] = temp;
            }
        }

    }
}