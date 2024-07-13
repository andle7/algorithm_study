package R1_bronze;

import java.util.Scanner;

public class p31408 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] cnt = new long[100001];
        long mx = 0;

        for (int i = 1; i <= N; i++) {
            int x = sc.nextInt();
            cnt[x]++;
            mx = Math.max(mx, cnt[x]);
        }

        if (mx <= (N + 1) / 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}

