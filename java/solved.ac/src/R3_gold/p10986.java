package R3_gold;

import java.util.Scanner;

public class p10986 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		
		long[] S = new long[N];
		long[] C = new long[M];
		long answer = 0;
		S[0] = in.nextInt();
		
		for(int i = 1; i<N; i++) {
			S[i] = S[i - 1] + in.nextInt();
		}
		
		for(int i = 0; i < N; i++) {
			int remain = (int) (S[i] % M);
		
			if(remain == 0) answer++;
		
			C[remain]++;
		}
		
		for(int i = 0; i<M; i++) {
			if(C[i] > 1) {
				answer = answer + (C[i] * (C[i] -1) /2);
			}
		}
		
		System.out.println(answer);
		
	}
}
