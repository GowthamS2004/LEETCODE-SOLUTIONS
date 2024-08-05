import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return res;
        }

        int row = matrix.length;
        int col = matrix[0].length;
        int top = 0, bottom = row - 1, left = 0, right = col - 1;

        while (top <= bottom && left <= right) {
            // Traverse from left to right along the top row
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            top++;

            // Traverse from top to bottom along the right column
            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--;

            // Traverse from right to left along the bottom row, if applicable
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Traverse from bottom to top along the left column, if applicable
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }

        return res;
    }
}
