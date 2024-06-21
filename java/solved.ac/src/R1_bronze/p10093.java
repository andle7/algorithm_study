package R1_bronze;

import java.util.Scanner;

public class p10093 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long A = in.nextLong();
        long B = in.nextLong();
        in.close();

        if (A > B) {
            long temp = A;
            A = B;
            B = temp;
        }

        if (A == B || A + 1 == B) {
            System.out.println(0);
        } else {
            System.out.println(B - A - 1);
            for (long i = A + 1; i < B; i++) {
                if (i > A + 1) {
                    System.out.print(" ");
                }
                System.out.print(i);
            }
            System.out.println();
        }
    }
}


// 1692ms
