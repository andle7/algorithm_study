package level_0;

public class p코드_처리하기 {
	public String solution(String code) {
		String answer = "";
		int mode = 0;

		for (int i = 0; i < code.length(); i++) {

			if (mode == 0 && code.charAt(i) == '1') {
				mode = 1;
			} else if (mode == 1 && code.charAt(i) == '1') {
				mode = 0;
			}

			if (code.charAt(i) != '1') {
				if (mode == 0 && i % 2 == 0) {
					answer += code.charAt(i);
				} else if (mode == 1 && i % 2 == 1) {
					answer += code.charAt(i);
				}
			}
		}

		if (answer.isEmpty())
			return "EMPTY";

		return answer;
	}
}
