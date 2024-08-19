package R1_bronze;

import java.util.Scanner;

public class p18301 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n12 = in.nextInt();
		
		in.close();
		System.out.println((n1 + 1)* (n2 + 1)/(n12 + 1) - 1);
		
	}
}
