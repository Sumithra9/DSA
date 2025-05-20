import java.util.*;

class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        List<int[]> zeroPositions = new ArrayList<>();

        // Step 1: Find all the positions of 0s
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    zeroPositions.add(new int[]{i, j});
                }
            }
        }

        // Step 2: Set rows and columns to 0 for each zero position
        for (int[] pos : zeroPositions) {
            int row = pos[0];
            int col = pos[1];

            // Set all elements in the row to 0
            for (int c = 0; c < m; c++) {
                matrix[row][c] = 0;
            }

            // Set all elements in the column to 0
            for (int r = 0; r < n; r++) {
                matrix[r][col] = 0;
            }
        }
    }
}
