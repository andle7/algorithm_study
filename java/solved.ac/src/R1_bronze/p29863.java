package R1_bronze;

import java.util.Scanner;
public class p29863 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		if(20 <= a && a <= 23) {
			System.out.println(24 - a + b);
		}else {
			System.out.println(b - a);
		}
		in.close();
	}
}