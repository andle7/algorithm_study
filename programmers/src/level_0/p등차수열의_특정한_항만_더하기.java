package level_0;

public class p등차수열의_특정한_항만_더하기 {
	public int solution(int a, int d, boolean[] included) {
		int answer = 0;

		for (int i = 0; i < included.length; i++) {
			if (included[i]) {
				answer += a + (i * d);
				continue;
			}
		}
		return answer;
	}
}
