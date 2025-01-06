package R3_gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2225 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        long[] dp = new long[N + 1];
        dp[0] = 1; // 초기값: dp[0] = 1 (합이 0을 만드는 방법은 1가지)

        for (int i = 1; i <= K; i++) {
            for (int j = 1; j <= N; j++) {
                dp[j] = (dp[j] + dp[j - 1]) % 1000000000;
            }
        }

        System.out.println(dp[N]);
        br.close();
    }
}
