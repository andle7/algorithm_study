package R1_bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class p27219_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int five = n/5;
		int remin = n%5;
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<five; i++) {
			sb.append("V");
		}
		
		for(int i = 0; i<remin; i++) {
			sb.append("I");
		}
		
		System.out.println(sb.toString());
	}
}
