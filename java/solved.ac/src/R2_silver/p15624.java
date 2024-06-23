package R2_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p15624 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		long[] fibonacc = new long[100000000];
		
		fibonacc[1] = 1;
		
		for (int i = 2; i <= N; i++) {
			fibonacc[i] = (fibonacc[i - 1] + fibonacc[i - 2]) % 1000000007;
		}

		System.out.print(fibonacc[N]);

	}
}
