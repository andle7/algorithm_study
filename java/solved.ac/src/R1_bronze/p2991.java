package R1_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2991 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < 3; i++) {
            int N = Integer.parseInt(st.nextToken());
            int count = 0;

            // 첫 번째 개 공격 판단
            if (N % (A + B) <= A && N % (A + B) != 0) {
                count++;
            }

            // 두 번째 개 공격 판단
            if (N % (C + D) <= C && N % (C + D) != 0) {
                count++;
            }

            System.out.println(count);
        }
    }
}

