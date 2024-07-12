package R1_bronze;

import java.util.Scanner;

public class p27889 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		
		switch(input) {
			case "NLCS":
				System.out.println("North London Collegiate School");
				break;
			case "BHA":
				System.out.println("Branksome Hall Asia");
				break;
			case "KIS":
				System.out.println("Korea International School");
				break;
			case "SJA":
				System.out.println("St. Johnsbury Academy");
				break;
		}	
	}
}
