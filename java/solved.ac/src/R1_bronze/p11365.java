package R1_bronze;

import java.util.Scanner;

public class p11365 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (true) {
			String arr = in.nextLine();

			if (arr.equals("END"))
				break;

			for (int i = arr.length() - 1; i > -1; i--) {
				System.out.print(arr.charAt(i));
			}

			System.out.println();

		}

	}
}
