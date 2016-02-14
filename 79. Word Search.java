public class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(search(board, i, j, word, 0))
                    return true;
            }
        }
        return false;
    }

    public boolean search(char[][] board, int i, int j, String word, int index) {
        if(index >= word.length())
            return true;

        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length)
            return false;

        if(board[i][j] == word.charAt(index)) {
            index++;
            char temp = board[i][j];
            board[i][j] = '#';
            boolean result = search(board, i + 1, j, word, index) || search(board, i - 1, j, word, index) || search(board, i, j + 1, word, index) || search(board, i, j - 1, word, index);
            board[i][j] = temp;
            return result;
        }
        return false;
    }
}