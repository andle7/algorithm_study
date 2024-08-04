package R2_silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class p1475_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		int[] num = new int[10];
		
		for(char ch : N.toCharArray()) {
			int i = ch - '0';
			if(i==9) { 
				i = 6;
			}
			num[i]++;
		}
		
		num[6] = num[6]/2 + num[6]%2;
		
		Arrays.sort(num);
		
		System.out.println(num[9]);

	}
}
