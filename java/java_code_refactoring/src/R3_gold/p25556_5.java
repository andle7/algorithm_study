package R3_gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p25556_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] tops = new int[4];
        for (int i = 0; i < 4; i++) {
            tops[i] = Integer.MIN_VALUE; 
        }

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());

            boolean placed = false;
            for (int j = 0; j < 4; j++) {
                if (tops[j] <= num) {
                    tops[j] = num; 
                    placed = true;
                    break;
                }
            }

            if (!placed) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}





