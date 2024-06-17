package deq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class p10866_linkedlist {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Deque<Integer> deq = new LinkedList<>();
		
		for(int i = 0; i<N; i++) {
			
			String[] input = br.readLine().split(" "); 
			
			switch (input[0]) {
			
				case "push_front":
						deq.addFirst(Integer.parseInt(input[1]));
						break;
					
				case "push_back": 
						deq.addLast(Integer.parseInt(input[1]));
						break;
						
				case "pop_front":
						if(deq.isEmpty()) {
							System.out.println(-1);
						}else {
							System.out.println(deq.pollFirst());
						}
						break;
						
				case "pop_back":
						if(deq.isEmpty()) {
							System.out.println(-1);
						}else {
							System.out.println(deq.pollLast());
						}
						break;
						
				case "size":
						System.out.println(deq.size());
						break;
						
				case "empty":
						if(deq.isEmpty()) {
							System.out.println(1);
						}else {
							System.out.println(0);						
						}
						break;
					
				case "front":
						if(deq.isEmpty()) {
							System.out.println(-1);
						}else {
							System.out.println(deq.peekFirst());
						}
						break;
				case "back":
						if(deq.isEmpty()) {
							System.out.println(-1);
						}else {
							System.out.println(deq.peekLast());
						}
						break;
			}			
		}
		
	}
}


// LinkedList java 표준 라이브러리 활용
// LinkedList 클래스와 같은 추상화된 클래스를 사용하는 것이  
// C언어 스타일에서 직접 노드를 이어주는 방식보다 유지보수성, 가독성은 이 방식이 더 좋다고 함.

/*

1. 추상화와 캡슐화: 추상화된 클래스를 사용하면 내부 구현이 숨겨져 있어서, 
개발자는 단순히 메서드를 호출하여 기능을 사용할 수 있습니다. 이는 코드의 가독성을 높이고, 
개발자가 클래스 내부의 세부 사항에 대해 너무 신경 쓰지 않고도 사용할 수 있게 합니다.

2. 재사용성: 추상화된 클래스를 사용하면 이를 다른 프로젝트에서도 재사용할 수 있습니다. 
또한 Java에서는 인터페이스와 구현의 분리를 통해 유연한 디자인을 할 수 있어서, 
코드의 재사용성을 높일 수 있습니다.

3. 유지보수성: 추상화된 클래스는 구현 세부 사항을 숨기기 때문에, 
내부 구조가 변경되어도 외부 인터페이스에 영향을 주지 않고 변경할 수 있습니다. 
이는 코드의 유지보수성을 높이고, 버그를 줄이는 데 도움을 줍니다.

4. 성능 최적화: 표준 라이브러리의 클래스는 보통 최적화되어 
있어서 일반적인 사용 상황에서는 좋은 성능을 제공합니다. 
개발자가 직접 구현한 연결 리스트보다 성능면에서 우수할 수 있습니다.


 */