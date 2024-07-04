package R1_bronze;

import java.util.Scanner;

public class p30087 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i = 0; i<n+1; i++) {
		String st = in.nextLine();
			switch(st) {
			case "Algorithm":
				System.out.println(204);
				break;
			case "DataAnalysis":
				System.out.println(207);
				break;
			case "ArtificialIntelligence":
				System.out.println(302);
				break;
			case "CyberSecurity":
				System.out.println("B" + 101);
				break;
			case "Network":
				System.out.println(303);
				break;
			case "Startup":
				System.out.println(501);
				break;
			case "TestStrategy":
				System.out.println(105);
				break;
			}
		}
	}
}
