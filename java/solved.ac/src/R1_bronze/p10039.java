package R1_bronze;

import java.util.Scanner;

public class p10039 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[] = new int[5];
		int sum = 0;
		int avg = 0;
		
		for(int i=0; i<5; i++) {
			arr[i] = in.nextInt();
			if(arr[i] < 40) {
				arr[i] = 40;
			}
			sum +=arr[i];
		}
		
		avg = (int)(sum/5.0);
		
		System.out.println(avg);
		
		in.close();
	}
}
