package R1_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p2711_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        // foreach 적용
        String[][] arr = new String[N][2];
        for (String[] row : arr) {
			String[] input = br.readLine().split(" ");
			row[0] = input[0];
			row[1] = input[1];
		}

        // 람다식&스트림 적용
        Arrays.stream(arr)
              .map(row -> {
                  int indexToRemove = Integer.parseInt(row[0]) - 1;
                  row[1] = row[1].substring(0, indexToRemove) + row[1].substring(indexToRemove + 1);
                  return row[1];
              })
              .forEach(System.out::println);
    }
}
