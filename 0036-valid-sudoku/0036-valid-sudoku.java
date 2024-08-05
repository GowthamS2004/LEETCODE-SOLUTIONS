class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Check each cell of the board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // If the cell is not empty
                if (board[i][j] != '.') {
                    // Check if the digit in the cell is valid
                    if (!isSafe(board, i, j, board[i][j])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean isSafe(char[][] board, int row, int col, char digit) {
        // Check row
        for (int j = 0; j < 9; j++) {
            if (j != col && board[row][j] == digit) {
                return false;
            }
        }
        
        // Check column
        for (int i = 0; i < 9; i++) {
            if (i != row && board[i][col] == digit) {
                return false;
            }
        }
        
        // Check 3x3 sub-box
        int boxRowStart = (row / 3) * 3;
        int boxColStart = (col / 3) * 3;
        for (int i = boxRowStart; i < boxRowStart + 3; i++) {
            for (int j = boxColStart; j < boxColStart + 3; j++) {
                if (i != row && j != col && board[i][j] == digit) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
