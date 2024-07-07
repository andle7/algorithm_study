package R2_silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class p1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int[] num = new int[9];
        
        for (char ch : N.toCharArray()) {
            int i = ch - '0';
            if (i == 9 || i == 6) {
                num[6]++;
            } else {
                num[i]++;
            }
        }
        
        num[6] = (num[6] + 1) / 2;
        
        int max = 0;
        for (int count : num) {
            if (count > max) {
                max = count;
            }
        }
        
        System.out.println(max);
    }
}