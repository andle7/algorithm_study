package R1_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p17362 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int mod8 = N % 8;        
        System.out.println(
            mod8 == 0       ? 2 :
            (N % 4 == 3)    ? 3 :
            (mod8 == 6)     ? 4 :
                              mod8
        );
    }
}