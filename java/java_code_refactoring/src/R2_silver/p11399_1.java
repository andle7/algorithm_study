package R2_silver;

import java.util.Scanner;

public class p11399_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr = new int[N];
		int[] sum = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		
		for(int i = 1; i < N; i++) {
			int insert_pointer = i;
			int insert_value = arr[i];
			for(int j = i - 1; j >=0; j--) {
				if(arr[j] < arr[i])
				{
					insert_pointer = j + 1;
					break;
				}
				if(j == 0) {
					insert_pointer = 0;
				}
			}
			for(int j = i; j > insert_pointer; j--) {
				arr[j] = arr[j-1];
			}
			arr[insert_pointer] = insert_value;
		}
		sum[0] = arr[0];
		
		for(int i = 1; i< N; i++) {
			sum[i] = sum[i-1] + arr[i];
		}
		
		int total = 0;
		
		for(int i = 0; i < N; i++) {
			total = total + sum[i];
		}
		
		System.out.println(total);
		
	}
}
