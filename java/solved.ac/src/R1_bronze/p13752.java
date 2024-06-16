package R1_bronze;

import java.util.Scanner;

public class p13752 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int [n];
		
		for(int i=0; i<n; i++) {
			arr[i] = in.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<arr[i]; j++) {
				System.out.print("=");
			}
			System.out.println();
		}
		
		
		in.close();
		
	}
}
