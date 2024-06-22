package R1_bronze;

import java.util.Scanner;

public class p10813 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[] arr = new int[N];
		int M = in.nextInt();
		
		
		
		
		for(int i = 0; i<N; i++) {
			arr[i] = i+1;
		}
		
		int tmp;
		
		for(int k = 0; k<M; k++) {
			int i = in.nextInt();
			int j = in.nextInt();
			
			tmp = arr[i-1];
			arr[i-1] = arr[j-1];
			arr[j-1] = tmp;
		}
		
		
		for(int i = 0; i<N; i++) {
			System.out.print(arr[i] + " ");
		}
		

	}
}
