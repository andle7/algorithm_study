package R1_bronze;

import java.util.Scanner;
public class p26575 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		for(int i = 0; i < n; i++) {
            double d = in.nextDouble();
			double f = in.nextDouble();
			double p = in.nextDouble();
			
			System.out.println("$" + String.format("%.2f", d * f * p));
		}
		in.close();
	}
}