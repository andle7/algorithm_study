package R1_bronze;

import java.util.Scanner;

public class p4999 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String a = in.next();
		String b = in.next();
		
		if (a.length() >= b.length()) {
			System.out.println("go");
		}else {
			System.out.println("no");
		}
	}
}