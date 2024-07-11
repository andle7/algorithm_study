package R1_bronze;

import java.util.Scanner;

public class p28938 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			arr[i] = in.nextInt();
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
