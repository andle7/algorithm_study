package R1_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class p2935 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger A = new BigInteger(br.readLine());
		String s = br.readLine();
		BigInteger B = new BigInteger(br.readLine());
		
		if(s.equals("+")) {
			System.out.println(A.add(B));
		}else {
			System.out.println(A.multiply(B));
		}
	}

}