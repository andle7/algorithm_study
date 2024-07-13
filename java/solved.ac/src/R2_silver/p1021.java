package R2_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class p1021 {

    static LinkedList<Integer> queue = new LinkedList<>(); // 숫자를 저장하는 큐
    static int[] retrievalTargets; // 뽑아내려는 숫자들을 저장하는 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int queueSize = Integer.parseInt(st.nextToken()); // 큐의 크기
        int numRetrievals = Integer.parseInt(st.nextToken()); // 뽑아내려는 숫자의 개수

        initializeQueue(queueSize); // 큐 초기화
        initializeRetrievalTargets(br.readLine(), numRetrievals); // 뽑아내려는 숫자 초기화
        br.close();

        // 최소 비용 계산하여 출력
        System.out.println(calculateMinimumCost(numRetrievals));
    }

    // 큐를 초기화하는 함수
    static void initializeQueue(int size) {
        for (int i = 1; i <= size; i++) {
            queue.offer(i); // 큐에 숫자 추가
        }
    }

    // 뽑아내려는 숫자들을 초기화하는 함수
    static void initializeRetrievalTargets(String targetsString, int numTargets) {
        StringTokenizer st = new StringTokenizer(targetsString);
        retrievalTargets = new int[numTargets];
        for (int i = 0; i < numTargets; i++) {
            retrievalTargets[i] = Integer.parseInt(st.nextToken()); // 배열에 숫자 저장
        }
    }

    // 주어진 뽑아내려는 숫자들에 대해 최소 비용을 계산하는 함수
    static int calculateMinimumCost(int numTargets) {
        int cost = 0;
        for (int i = 0; i < numTargets; i++) {
            int targetIndex = queue.indexOf(retrievalTargets[i]); // 뽑을 숫자의 인덱스 찾기
            int middleIndex = queue.size() % 2 == 0 ? queue.size() / 2 - 1 : queue.size() / 2;

            if (targetIndex <= middleIndex) {
                cost += moveToFront(targetIndex); // 앞에서 뒤로 이동하는 비용 계산
            } else {
                cost += moveToBack(targetIndex); // 뒤에서 앞으로 이동하는 비용 계산
            }
            queue.pollFirst(); // 큐에서 해당 숫자 뽑기
        }
        return cost; // 총 비용 반환
    }

    // 특정 인덱스까지의 숫자를 큐의 앞으로 이동시키는 함수
    static int moveToFront(int targetIndex) {
        int moves = 0;
        for (int j = 0; j < targetIndex; j++) {
            queue.offerLast(queue.pollFirst()); // 큐의 맨 앞 요소를 뽑아서 맨 뒤로 이동
            moves++; // 이동 횟수 증가
        }
        return moves; // 이동한 횟수 반환
    }

    // 특정 인덱스까지의 숫자를 큐의 뒤로 이동시키는 함수
    static int moveToBack(int targetIndex) {
        int moves = 0;
        for (int j = 0; j < queue.size() - targetIndex; j++) {
            queue.offerFirst(queue.pollLast()); // 큐의 맨 뒤 요소를 뽑아서 맨 앞으로 이동
            moves++; // 이동 횟수 증가
        }
        return moves; // 이동한 횟수 반환
    }
}
