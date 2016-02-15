/*            neighbout lives   assigned
 * 1 -> 0           < 2             -1
 * 1 -> 1           2 or 3          same
 * 1 -> 0           > 3             -1
 * 0 -> 1           3               -2
 *
 *
 */

public class Solution {
    public void gameOfLife(int[][] board) {
        if(board == null || board.length == 0)
            return;

        int m = board.length, n = board[0].length;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                int lives = check(board, m, n, i, j);

                if(board[i][j] == 1)
                    if(lives < 2 || lives > 3)
                        board[i][j] = -1;
                if(board[i][j] == 0)
                    if(lives == 3)
                        board[i][j] = -2;
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == -1)
                    board[i][j] = 0;

                if(board[i][j] == -2)
                    board[i][j] = 1;
            }
        }


    }

    public static int check(int[][] board, int m, int n, int i, int j) {
        int lives = 0;

        for(int x = Math.max(i - 1, 0); x <= Math.min(i + 1, m - 1); x++) {
            for(int y = Math.max(j - 1, 0); y <= Math.min(j + 1, n - 1); y++) {
                if(x != i || y != j) // skip board[i][j]
                    if(board[x][y] == 1 || board[x][y] == -1) {
                        lives++;
                    }
            }
        }

        return lives;
    }
}