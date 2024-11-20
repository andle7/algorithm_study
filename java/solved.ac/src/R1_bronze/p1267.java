package R1_bronze;

import java.util.Scanner;

public class p1267 {
 
    public static void main(String args[]) throws Exception {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K;
        int YoungSik = 0, MinSik = 0;
        for (int i = 0; i < N; i++) {
            K = in.nextInt();
            YoungSik += ((K / 30) + 1) * 10;
            MinSik += ((K / 60) + 1) * 15;
 
        }
        if (YoungSik == MinSik) {
            System.out.println("Y M " + YoungSik);
        } else if (YoungSik < MinSik) {
            System.out.println("Y " + YoungSik);
        } else if (YoungSik > MinSik) {
            System.out.println("M " + MinSik);
        }
    }
}
