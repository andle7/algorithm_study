package level_0;

public class pflag에_따라_다른_값_반환하기 {
	public int solution(int a, int b, boolean flag) {
		int answer = 0;

		if (flag == true) {
			answer = a + b;
		} else {
			answer = a - b;
		}

		return answer;
	}
}
