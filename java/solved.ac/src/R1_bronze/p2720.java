package R1_bronze;

import java.util.Scanner;

public class p2720 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] coins = {25, 10, 5, 1};
        int testCase = in.nextInt();

        for (int i = 0; i < testCase; i++) {
            int change = in.nextInt();
            StringBuilder result = new StringBuilder();

            for (int coin : coins) {
                result.append(change / coin).append(" ");
                change %= coin;
            }
            System.out.println(result.toString().trim());
        }
    }
}
