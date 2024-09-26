package R1_bronze;

import java.util.Scanner;

public class p4470 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = Integer.parseInt(in.nextLine());
		for (int i = 0; i < N; i++) {

			System.out.println((i + 1) + ". " + in.nextLine());
		}

		in.close();
	}
}