package R2_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1500 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        if (s == k) {
            System.out.println(1);
            return;
        }

        int base = s / k;
        int remainder = s % k;

        long result = 1;
        for (int i = 0; i < k; i++) {
            if (i < remainder) {
                result *= (base + 1);
            } else {
                result *= base;
            }
        }

        System.out.println(result);
    }
}
