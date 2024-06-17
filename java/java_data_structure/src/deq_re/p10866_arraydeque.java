package deq_re;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class p10866_arraydeque {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deq = new ArrayDeque<>();

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push_front":
                    deq.offerFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    deq.offerLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    sb.append(deq.isEmpty() ? -1 : deq.pollFirst()).append("\n");
                    break;
                case "pop_back":
                    sb.append(deq.isEmpty() ? -1 : deq.pollLast()).append("\n");
                    break;
                case "size":
                    sb.append(deq.size()).append("\n");
                    break;
                case "empty":
                    sb.append(deq.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append(deq.isEmpty() ? -1 : deq.peekFirst()).append("\n");
                    break;
                case "back":
                    sb.append(deq.isEmpty() ? -1 : deq.peekLast()).append("\n");
                    break;
            }
        }

        System.out.print(sb);
        br.close();
    }
}


// ArrayDeque가 LinkedList 보다 더 빠른듯
/*

1. 메모리 접근 패턴: ArrayDeque는 내부적으로 배열을 사용하여 요소를 저장합니다. 
배열은 메모리에 연속적으로 할당되어 있기 때문에 CPU 캐시 메모리에서의 효율성이 높습니다. 
반면 LinkedList는 각 노드가 메모리 여기저기에 흩어져 있어서 CPU 캐시의 효율성이 떨어질 수 있습니다.

2. 랜덤 액세스 성능: ArrayDeque는 배열 기반이기 때문에 인덱스를 이용한 랜덤 액세스가 매우 빠릅니다. 
반면 LinkedList는 각 노드를 차례대로 탐색해야 하므로 랜덤 액세스 성능이 떨어질 수 있습니다.

3. 공간 효율성: ArrayDeque는 배열을 기반으로 하기 때문에 요소 당 
추가적인 포인터나 레퍼런스를 저장할 필요가 없습니다. 반면 LinkedList는 각 노드마다 다음 노드를 가리키는
 포인터를 추가적으로 저장해야 합니다.

4. 삽입/삭제 성능: ArrayDeque는 배열의 끝에 삽입/삭제하는 연산이 O(1)의 시간 복잡도를 가집니다. 
LinkedList는 요소가 많은 경우에는 O(1)이지만 일반적인 경우에는 O(n)의 시간 복잡도를 가질 수 있습니다. 
또한 ArrayDeque는 양쪽 끝에서 삽입/삭제도 O(1)으로 처리할 수 있지만 
LinkedList는 양쪽 끝에서의 삽입/삭제가 O(1)이 아닐 수 있습니다.

따라서 요소의 삽입/삭제가 빈번하게 발생하고, 랜덤 액세스가 필요한 경우 ArrayDeque가 LinkedList보다 
성능상 이점을 가질 수 있습니다. 그러나 LinkedList는 중간 삽입/삭제가 자주 발생하고, 
메모리 할당/해제 비용이 크게 상승하지 않는 한, 상황에 따라서는 유용할 수 있습니다.

*/




/*

ArrayDeque<Integer> deq = new ArrayDeque<>();

과

Deque<Integer> deq = new ArrayDeque<>();

의 차이?

타입 선언의 차이:

ArrayDeque<Integer> deq = new ArrayDeque<>();: 
이 경우에는 deq 변수가 ArrayDeque 타입으로 선언되어 있습니다. 
따라서 deq 변수에는 ArrayDeque의 모든 메서드와 기능에 접근할 수 있습니다.

Deque<Integer> deq = new ArrayDeque<>();: 
이 경우에는 deq 변수가 Deque 인터페이스 타입으로 선언되어 있습니다. 
Deque는 덱(double-ended queue)을 나타내는 인터페이스이며, 
ArrayDeque는 이 인터페이스를 구현한 구체적인 클래스입니다. 
따라서 deq 변수를 통해 사용할 수 있는 메서드들은 Deque 인터페이스에 정의된 메서드들로 제한됩니다.


사용할 수 있는 메서드의 범위:

ArrayDeque<Integer> 타입으로 선언한 경우에는 ArrayDeque 클래스의 모든 메서드를 사용할 수 있습니다. 
이는 ArrayDeque가 Deque 인터페이스를 구현하고 있기 때문에 Deque 인터페이스에서 
정의된 메서드들뿐만 아니라, ArrayDeque에서 추가로 구현된 메서드들도 사용 가능합니다.

Deque<Integer> 타입으로 선언한 경우에는 변수 deq를 통해 Deque 인터페이스에서 
정의된 메서드들만 사용할 수 있습니다. 즉, ArrayDeque에서 추가된 특정 메서드들은 직접적으로 
사용할 수 없으며, 변수를 ArrayDeque 타입으로 형변환해야만 추가 메서드에 접근할 수 있습니다.

일반적으로 프로그램에서는 가능한한 더 범용적인 인터페이스나 상위 클래스를 사용하여 
코드를 작성하는 것이 유지보수와 확장성 측면에서 좋습니다. 
따라서 Deque<Integer> deq = new ArrayDeque<>();
와 같이 코드를 작성하는 것이 권장됩니다.

*/