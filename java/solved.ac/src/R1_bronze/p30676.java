package R1_bronze;

import java.util.Scanner;

public class p30676 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		if(N>=620 && N<=780) {
			System.out.println("Red");
		}else if(N>=590) {
			System.out.println("Orange");
		}else if(N>=570) {
			System.out.println("Yellow");
		}else if(N>=495) {
			System.out.println("Green");
		}else if(N>=450) {
			System.out.println("Blue");
		}else if(N>=425) {
			System.out.println("Indigo");
		}else if(N>=380) {
			System.out.println("Violet");
		}
	}
}
