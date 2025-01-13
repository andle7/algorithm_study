package R2_silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p16756_1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(reader.readLine());
        String[] input = reader.readLine().split(" ");
        int minDifference = Integer.MAX_VALUE;

        int prev = Integer.parseInt(input[0]);
        for (int i = 1; i < size; i++) {
            int current = Integer.parseInt(input[i]);
            int diff = current - prev;
            if (diff < 0) diff = -diff;
            if (diff < minDifference) minDifference = diff;
            prev = current;
        }

        writer.write(Integer.toString(minDifference));
        writer.flush();
        reader.close();
        writer.close();
    }
}
