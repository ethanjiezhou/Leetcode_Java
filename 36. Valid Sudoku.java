public class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++) {
            HashSet<Character> row = new HashSet<Character>();
            HashSet<Character> colum = new HashSet<Character>();
            HashSet<Character> cube = new HashSet<Character>();
            for(int j = 0; j < 9; j++) {
                // check row
                if(board[i][j] != '.' && !row.add(board[i][j]))
                    return false;
                // check colum
                if(board[j][i] != '.' && !colum.add(board[j][i]))
                    return false;
                // check cube
                int RowIndex = 3*(i/3);
                int ColIndex = 3*(i%3);
                if(board[RowIndex + j/3][ColIndex + j%3]!='.' && !cube.add(board[RowIndex + j/3][ColIndex + j%3]))
                    return false;
            }
        }
        return true;
    }
}