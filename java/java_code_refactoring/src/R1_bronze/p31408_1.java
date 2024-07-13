package R1_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p31408_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] cnt = new long[100001];
        long mx = 0;

        String[] input = br.readLine().split(" ");
        
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(input[i]);
            cnt[x]++;
            mx = Math.max(mx, cnt[x]);
        }

        if (mx <= (N + 1) / 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        br.close();
    }
}