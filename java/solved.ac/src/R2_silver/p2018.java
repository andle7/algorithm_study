package R2_silver;

import java.util.Scanner;

public class p2018 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int count =1;
		int sdx = 1;
		int edx = 1;
		int sum = 1;
		while(edx != N) {
			if(sum == N) {
				count++;
				edx++;
				sum = sum + edx;
			} else if(sum > N) {
				sum = sum - sdx;
				sdx++;
			} else {
				edx++;
				sum = sum + edx;
			}
		}
		System.out.println(count);
	}
}
