package R1_bronze;

import java.util.Scanner;

public class p24883 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		switch(s) {
			case "N":
			    System.out.println("Naver D2");
			    break;
			case "n":
				System.out.println("Naver D2");
				break;
			default :
				System.out.println("Naver Whale");
				break;
		}
	}
}
