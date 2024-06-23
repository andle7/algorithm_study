package R1_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p15624 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (N == 0) {
            System.out.print(0);
            return;
        }

        long MOD = 1000000007;
        long a = 0;
        long b = 1;

        for (int i = 2; i <= N; i++) {
            long temp = (a + b) % MOD;
            a = b;
            b = temp;
        }

        System.out.print(b);
    }
}

