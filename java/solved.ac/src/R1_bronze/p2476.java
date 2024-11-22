package R1_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2476 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int max = 0;

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            int money = (A == B && B == C) ? 10000 + A * 1000 :
                        (A == B || A == C) ? 1000 + A * 100 :
                        (B == C) ? 1000 + B * 100 :
                        Math.max(A, Math.max(B, C)) * 100;

            max = Math.max(max, money);
        }
        System.out.println(max);
    }
}
