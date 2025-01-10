package R1_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p30501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String answer = "";

        while (num-- > 0) {
            String str = br.readLine();
            if (str.contains("S")) {
                answer = str;
            }
        }

        System.out.println(answer);
    }
}

