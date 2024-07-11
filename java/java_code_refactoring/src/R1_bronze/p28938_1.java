package R1_bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class p28938_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int sum = 0;
		
		String[] input = br.readLine().split(" ");
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(input[i]);
			sum += arr[i];
		}
		
		if(sum > 0) {
			System.out.println("Right");
		}else if(sum == 0) {
			System.out.println("Stay");
		}else {
			System.out.println("Left");
		}
	}
}
