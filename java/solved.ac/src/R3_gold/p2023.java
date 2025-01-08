package R3_gold;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p2023 {
    static int digits;
    static int[] firstDigits = {2, 3, 5, 7};
    static int[] oddDigits = {1, 3, 5, 7, 9};
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        digits = Integer.parseInt(input.readLine());
        for (int start : firstDigits)
            findPrimes(1, start);
        output.write(result.toString());
        output.flush();
        output.close();
        input.close();
    }

    static void findPrimes(int depth, int value) {
        if (!isPrime(value)) return;
        if (depth == digits) {
            result.append(value).append("\n");
            return;
        }
        for (int next : oddDigits)
            findPrimes(depth + 1, value * 10 + next);
    }

    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2, limit = (int) Math.sqrt(num); i <= limit; i++)
            if (num % i == 0) return false;
        return true;
    }
}
