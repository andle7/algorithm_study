package R2_silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class p12891 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 줄: N과 M
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 두 번째 줄: DNA 문자열
        String dna = br.readLine();

        // 세 번째 줄: 최소 개수 조건
        int[] minCount = new int[4]; // A, C, G, T의 최소 개수
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            minCount[i] = Integer.parseInt(st.nextToken());
        }

        // 현재 윈도우의 문자 개수를 저장하는 배열
        int[] currentCount = new int[4];

        // 초기 윈도우 구성 (첫 번째 M개의 문자)
        for (int i = 0; i < M; i++) {
            addChar(currentCount, dna.charAt(i));
        }

        // 조건을 만족하는 부분 문자열 개수
        int result = 0;
        if (checkValid(currentCount, minCount)) {
            result++;
        }

        // 슬라이딩 윈도우 탐색
        for (int i = M; i < N; i++) {
            // 윈도우의 첫 문자를 제거하고 새 문자를 추가
            removeChar(currentCount, dna.charAt(i - M));
            addChar(currentCount, dna.charAt(i));

            // 조건 확인
            if (checkValid(currentCount, minCount)) {
                result++;
            }
        }

        // 결과 출력
        System.out.println(result);
        br.close();
    }

    // 현재 문자 개수 배열에 문자 추가
    private static void addChar(int[] count, char c) {
        switch (c) {
            case 'A': count[0]++; break;
            case 'C': count[1]++; break;
            case 'G': count[2]++; break;
            case 'T': count[3]++; break;
        }
    }

    // 현재 문자 개수 배열에서 문자 제거
    private static void removeChar(int[] count, char c) {
        switch (c) {
            case 'A': count[0]--; break;
            case 'C': count[1]--; break;
            case 'G': count[2]--; break;
            case 'T': count[3]--; break;
        }
    }

    // 현재 윈도우가 조건을 만족하는지 확인
    private static boolean checkValid(int[] current, int[] min) {
        for (int i = 0; i < 4; i++) {
            if (current[i] < min[i]) {
                return false;
            }
        }
        return true;
    }
}

