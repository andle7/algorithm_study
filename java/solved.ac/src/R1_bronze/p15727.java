package R1_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p15727 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(bf.readLine());
		int T = 0;
		
		if (L % 5 == 0) {
			T = L / 5;
		} else {
			T = L / 5 + 1;
		}
		System.out.println(T);
	}
}