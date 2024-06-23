package R1_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class p4150 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        BigInteger bt = new BigInteger(br.readLine());
        
        int N = bt.intValue();
        
        System.out.println(fibonacci(N));
    }
    
    static BigInteger fibonacci(int N) {
        if (N == 0) return 
        		BigInteger.ZERO;
        if (N == 1) return 
        		BigInteger.ONE;
        
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger c = BigInteger.ZERO;
        
        for (int i = 2; i <= N; i++) {
            c = a.add(b);
            a = b;
            b = c;
        }
        
        return c;
    }
}
