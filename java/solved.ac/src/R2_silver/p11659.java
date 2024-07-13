package R2_silver;

import java.util.Scanner;

public class p11659 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int[] arr = new int[N];
		
		
		for(int i = 0; i<N; i++) {
			arr[i] = in.nextInt();
		}
		
		
		for(int i = 0; i<M; i++) {
			int sum = 0;
			int A = in.nextInt();
			int B = in.nextInt();
		
			for(int j = A-1; j<B; j++) {
				sum += arr[j]; 
			}
			System.out.println(sum);
		}
	}
}

// 시간초과
