package R2_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2018_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count =1;
		int sdx = 1;
		int edx = 1;
		int sum = 1;
		while(edx != N) {
			if(sum == N) {
				count++;
				edx++;
				sum = sum + edx;
			} else if(sum > N) {
				sum = sum - sdx;
				sdx++;
			} else {
				edx++;
				sum = sum + edx;
			}
		}
		System.out.println(count);
	}
}
