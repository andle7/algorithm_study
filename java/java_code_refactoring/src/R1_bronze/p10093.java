package R1_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10093 {
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String[] input = br.readLine().split(" ");
        long A = Long.parseLong(input[0]);
        long B = Long.parseLong(input[1]);
        br.close();

        StringBuilder sb = new StringBuilder();
        
        
        if (A > B) {
            long temp = A;
            A = B;
            B = temp;
        }

        if (A == B || A + 1 == B) {
        	sb.append(0).append("\n");
        } else {
        	sb.append(B - A -1).append("\n");
            for (long i = A + 1; i < B; i++) {
                if (i > A + 1) {
                	sb.append(" ");
                }
                sb.append(i);
            }
            sb.append("\n");
        }
        
        
        System.out.println(sb.toString());
    }
}



// 284ms