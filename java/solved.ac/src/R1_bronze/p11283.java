package R1_bronze;

import java.util.Scanner;

public class p11283 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		char hangul = in.nextLine().charAt(0);
		in.close();

		System.out.println((int) hangul - 44031);

	}

}