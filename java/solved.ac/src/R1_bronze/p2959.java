package R1_bronze;

import java.util.Scanner;
import java.util.Arrays;

public class p2959 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] steps = new int[4];
        for (int i = 0; i < 4; i++) {
            steps[i] = in.nextInt();
        }
        in.close();

        Arrays.sort(steps);

        int maxArea = steps[0] * steps[2];
        System.out.println(maxArea);
    }
}