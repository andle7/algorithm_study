package R1_bronze;

import java.util.Scanner;

public class p27989 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		
		if(N*100 >= M) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
