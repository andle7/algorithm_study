package R1_bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p4806 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        
        while (reader.readLine() != null) {
            cnt++;
        }
        
        System.out.println(cnt);
    }
}
