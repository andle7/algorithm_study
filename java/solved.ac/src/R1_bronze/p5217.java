package R1_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p5217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            result.append("Pairs for ").append(n).append(": ");

            boolean firstPair = true;
            for (int j = 1; j < n - j; j++) {
                if (!firstPair) {
                    result.append(", ");
                }
                result.append(j).append(" ").append(n - j);
                firstPair = false;
            }

            result.append("\n");
        }

        System.out.print(result);
    }
}
