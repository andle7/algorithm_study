package level_0;

import java.util.Scanner;

public class p홀짝_구분하기 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		if (n % 2 == 0) {
			System.out.println(n + " is even");
		} else {
			System.out.println(n + " is odd");
		}

	}
}
