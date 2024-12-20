package R1_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int k = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
        int m = Integer.parseInt(input[2]);

        int result = Math.max(0, k * n - m);
        System.out.print(result);
    }
}
