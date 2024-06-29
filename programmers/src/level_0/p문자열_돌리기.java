package level_0;

import java.util.Scanner;

public class p문자열_돌리기 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();

		for (int i = 0; i < a.length(); i++) {
			System.out.println(a.charAt(i));
		}

	}
}
