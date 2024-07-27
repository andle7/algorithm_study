package R1_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p31994 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String max = "";
        int maxCnt = 0;

        for (int i = 0; i < 7; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            int cnt = Integer.parseInt(st.nextToken());

            if (maxCnt < cnt) {
                maxCnt = cnt;
                max = input;
            }
        }

        sb.append(max);
        System.out.println(sb.toString());
    }
}