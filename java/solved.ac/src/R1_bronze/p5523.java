package R1_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p5523 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()), Awin = 0, Bwin = 0;

        while (T-- > 0) {
            String[] input = br.readLine().split(" ");
            int A = Integer.parseInt(input[0]), B = Integer.parseInt(input[1]);
            if (A > B) Awin++;
            else if (B > A) Bwin++;
        }
        System.out.println(Awin + " " + Bwin);
    }
}

