package level_0;

public class p이어_붙인_수 {
	public int solution(int[] num_list) {
		int answer = 0;
		int a = 0;
		int b = 0;

		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] % 2 == 0) {
				a = a * 10 + num_list[i];
			} else {
				b = b * 10 + num_list[i];

			}
		}

		answer = b + a;

		return answer;
	}
}
