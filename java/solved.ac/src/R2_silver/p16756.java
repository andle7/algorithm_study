package R2_silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class p16756 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(reader.readLine());
        int[] numbers = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int minDifference = Integer.MAX_VALUE;
        for (int i = 1; i < size; i++) {
            minDifference = Math.min(minDifference, Math.abs(numbers[i] - numbers[i - 1]));
        }

        writer.write(Integer.toString(minDifference));
        writer.flush();
        reader.close();
        writer.close();
    }
}
