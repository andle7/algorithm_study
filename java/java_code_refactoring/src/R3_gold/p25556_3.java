package R3_gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p25556_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] tops = new int[4];
        for (int i = 0; i < 4; i++) {
            tops[i] = Integer.MIN_VALUE; 
        }

        boolean flag = true;

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
                flag = false;
                break;
            }
        }

        System.out.println(flag ? "YES" : "NO");
    }
}




