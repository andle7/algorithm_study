package R1_bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class p26545_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			int number = Integer.parseInt(br.readLine());
			sum += number;
		}
		
		System.out.println(sum);
		
	}
}
