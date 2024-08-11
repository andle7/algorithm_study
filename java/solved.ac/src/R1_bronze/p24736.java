package R1_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p24736 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[][] scores = new int[2][5];
        
        for (int row = 0; row < 2; row++) {
            String[] line = reader.readLine().split(" ");
            for (int col = 0; col < 5; col++) {
                scores[row][col] = Integer.parseInt(line[col]);
            }
        }

        int[] weights = {6, 3, 2, 1, 2};
        int[] totalScores = new int[2];

        for (int row = 0; row < 2; row++) {
            int total = 0;
            for (int col = 0; col < 5; col++) {
                total += weights[col] * scores[row][col];
            }
            totalScores[row] = total;
        }

        System.out.println(totalScores[0] + " " + totalScores[1]);
    }
}
