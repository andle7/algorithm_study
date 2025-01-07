package R1_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1075 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());

        // 뒤 두 자리를 00으로 바꾸고 나누어 떨어지는 가장 작은 수 계산
        N = (N / 100) * 100;
        int result = (F - (N % F)) % F;

        // 결과 출력
        System.out.format("%02d", result);
    }
}

