package R2_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1080 {

    private static int[][] matrixA, matrixB;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] dimensions = reader.readLine().split(" ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        matrixA = new int[rows][cols];
        matrixB = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String row = reader.readLine();
            for (int j = 0; j < cols; j++) {
                matrixA[i][j] = row.charAt(j) - '0';
            }
        }

        for (int i = 0; i < rows; i++) {
            String row = reader.readLine();
            for (int j = 0; j < cols; j++) {
                matrixB[i][j] = row.charAt(j) - '0';
            }
        }

        System.out.println(solve(rows, cols));
    }

    private static int solve(int rows, int cols) {
        if (rows < 3 || cols < 3) {
            return isEqual(rows, cols) ? 0 : -1;
        }

        int operations = 0;
        for (int i = 0; i <= rows - 3; i++) {
            for (int j = 0; j <= cols - 3; j++) {
                if (matrixA[i][j] != matrixB[i][j]) {
                    flip3x3(i, j);
                    operations++;
                }
            }
        }

        return isEqual(rows, cols) ? operations : -1;
    }

    private static boolean isEqual(int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrixA[i][j] != matrixB[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void flip3x3(int row, int col) {
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                matrixA[i][j] ^= 1; // XOR 연산을 사용해 0과 1을 토글
            }
        }
    }
}
