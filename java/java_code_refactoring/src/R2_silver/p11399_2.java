package R2_silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class p11399_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[] arr = new int[N];
		int[] sum = new int[N];
		
		String[] input = br.readLine().split(" ");
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		
		for(int i = 1; i < N; i++) {
			int key = arr[i];
			int j = i - 1;
			
			while(j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
			
		}
		
		sum[0] = arr[0];
		
		for(int i = 1; i < N; i++) {
			sum[i] = sum[i - 1] + arr[i];
		}
		
		int total = 0;
		
		for(int i = 0; i < N; i++) {
			total += sum[i];
		}
		
		System.out.println(total);
		
		
		
	}
}
