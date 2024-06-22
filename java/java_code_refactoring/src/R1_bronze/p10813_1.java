package R1_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class p10813_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		
		int N = Integer.parseInt(input[0]);
		int[] arr = new int[N];
		int M = Integer.parseInt(input[1]);
		
		for(int i = 0; i<N; i++) {
			arr[i] = i+1;
		}
		
		int tmp;
		
		for(int k = 0; k<M; k++) {
			input = br.readLine().split(" ");
			int i = Integer.parseInt(input[0]);
			int j = Integer.parseInt(input[1]);
			
			tmp = arr[i-1];
			arr[i-1] = arr[j-1];
			arr[j-1] = tmp;
		}
		
		
		for(int i = 0; i<N; i++) {
			System.out.print(arr[i] + " ");
		}
		

	}
}
