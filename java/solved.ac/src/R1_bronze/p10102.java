package R1_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10102 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        String input = br.readLine();
        String[] arr = input.split("");

        int A = 0;
        int B = 0;

        for (int i = 0; i < N; i++) {
            if (arr[i].equals("A")) {
                A++;
            } else if (arr[i].equals("B")) {
                B++;
            }
        }

        String result;

        if (A > B) {
            result = "A";
        } else if (A < B) {
            result = "B";
        } else {
            result = "Tie";
        }

        System.out.println(result);
    }
}
