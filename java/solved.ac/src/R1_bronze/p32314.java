package R1_bronze;

import java.util.Scanner;

public class p32314 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 입력 받기
        int a = in.nextInt(); // 트리의 암페어
        int w = in.nextInt(); // 어댑터의 와트
        int v = in.nextInt(); // 어댑터의 볼트

        // 어댑터 암페어 계산
        int adapterAmpere = w / v;

        // 어댑터가 트리의 암페어 요구 조건을 충족하는지 확인
        if (adapterAmpere >= a) {
            System.out.println(1); // 조건 충족
        } else {
            System.out.println(0); // 조건 불충족
        }

        in.close();
    }
}
