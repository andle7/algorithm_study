package R1_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p28352 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		long num = Long.parseLong(br.readLine());
		long fac = 1;
		
		for(int i = 1; i<=num; i++) {
			fac *= i;
		}
		
		long result = fac /(7*24*60*60);
		
		sb.append(result);
		System.out.println(sb.toString());
	}
}
