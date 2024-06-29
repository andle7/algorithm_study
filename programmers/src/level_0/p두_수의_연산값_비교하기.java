package level_0;

public class p두_수의_연산값_비교하기 {
	public int solution(int a, int b) {
		int answer = 0;

		if (Integer.parseInt(String.valueOf(a) + String.valueOf(b)) > 2 * a * b) {
			answer = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
		} else {
			answer = 2 * a * b;
		}

		return answer;

	}
}
