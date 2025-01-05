package R3_gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1025 {
    static int rows, cols, maxSquare = -1;
    static int[][] grid;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] dims = br.readLine().split(" ");
        rows = Integer.parseInt(dims[0]);
        cols = Integer.parseInt(dims[1]);

        grid = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            String line = br.readLine();
            for (int j = 0; j < cols; j++) {
                grid[i][j] = line.charAt(j) - '0';
            }
        }

        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < cols; y++) {
                for (int dx = -rows; dx <= rows; dx++) {
                    for (int dy = -cols; dy <= cols; dy++) {
                        if (dx == 0 && dy == 0) continue;

                        int num = 0, nx = x, ny = y;
                        while (nx >= 0 && nx < rows && ny >= 0 && ny < cols) {
                            num = num * 10 + grid[nx][ny];
                            if (isSquare(num)) maxSquare = Math.max(maxSquare, num);
                            nx += dx;
                            ny += dy;
                        }
                    }
                }
            }
        }

        System.out.println(maxSquare);
    }

    private static boolean isSquare(int n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }
}
