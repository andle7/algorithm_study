package R1_bronze;

import java.util.Scanner;

public class p27219 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int five = n/5;
		int remin = n%5;
		
		for(int i = 0; i<five; i++) {
			System.out.print("V");
		}
		
		for(int i = 0; i<remin; i++) {
			System.out.print("I");
		}
	}
}
