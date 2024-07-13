package R1_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class p24568_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int R = Integer.parseInt(br.readLine());
		int S = Integer.parseInt(br.readLine());
		int cal = R * 8 + S * 3;
		int result = cal - 28;
		
		System.out.println(result);
	}
}
