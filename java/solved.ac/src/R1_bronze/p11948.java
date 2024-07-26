package R1_bronze;

import java.util.Arrays;
import java.util.Scanner;

public class p11948 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr1 = new int[4];
		int[] arr2 = new int[2];
		int sum = 0;

		for (int i = 0; i < 4; i++) {
			arr1[i] = in.nextInt();
		}

		Arrays.sort(arr1);

		for (int i = 0; i < 2; i++) {
			arr2[i] = in.nextInt();
		}

		Arrays.sort(arr2);

		for (int i = arr1.length -1; i > 0; i--) {
			sum += arr1[i];
		}

		sum += arr2[1];

		System.out.println(sum);

	}
}
