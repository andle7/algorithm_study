package R1_bronze;

import java.util.Scanner;

public class p25372 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String password;
		int N;

		N = in.nextInt();

		for (int i = 0; i < N; i++) {

			password = in.next();

			if (password.length() >= 6 && password.length() <= 9)
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}
}