package R2_silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class p1850 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long result = gcd(A, B);
		while(result > 0) {
			bw.write("1");
			result--;
		}
		bw.flush();
		bw.close();
	}
	
	public static long gcd(long A, long B) {
		if(B == 0)
			return A;
		else
			return gcd(B, A % B);
	}
}
