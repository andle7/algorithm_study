package R1_bronze;

import java.util.Arrays;
import java.util.Scanner;

public class p6840 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		
		int[] arr = new int[3];
		
		for(int i = 0; i<3; i++) {
			arr[0] = A;
			arr[1] = B;
			arr[2] = C;
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[1]);

	}
}
