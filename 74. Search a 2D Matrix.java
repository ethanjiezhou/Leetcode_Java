public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int i = 0;
        int j = m * n - 1;
        while(i < j) {
            int mid = (i + j) / 2;
            if(target < matrix[mid / n][mid % n]) {
                j = mid - 1;
            } else if(target > matrix[mid / n][mid % n]) {
                i = mid + 1;
            } else {
                return true;
            }
        }
        int mid = (i + j) / 2;
        return matrix[mid / n][mid % n] == target;
    }
}