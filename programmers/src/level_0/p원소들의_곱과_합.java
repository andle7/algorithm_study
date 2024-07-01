package level_0;

public class p원소들의_곱과_합 {
	public int solution(int[] num_list) {
		int answer = 0;
		int sum1 = 1;
		int sum2 = 0;

		for (int i = 0; i < num_list.length; i++) {
			sum1 *= num_list[i];
			sum2 += num_list[i];
		}

		sum2 = (int) Math.pow(sum2, 2);

		if (sum1 < sum2) {
			answer = 1;
		} else {
			answer = 0;
		}

		return answer;
	}
}
