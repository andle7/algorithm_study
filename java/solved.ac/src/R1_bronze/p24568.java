package R1_bronze;

import java.util.Scanner;

public class p24568 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int R = in.nextInt();
		int S = in.nextInt();
		int cal = R * 8 + S * 3;
		int result = cal - 28;
		
		System.out.println(result);
	}
}
