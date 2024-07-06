class Solution {
    public String solution(int[] food) {
        String answer = "";
        String num = "";

        for (int i = 0; i < food.length; i++) {
            if (food[i] / 2 != 0) {
                for (int j = 0; j < food[i] / 2; j++) {
                    answer += i;
                }
            }
        }

        answer += 0;

        for (int i = 1; i < answer.length(); i++) {
            num += answer.charAt(answer.length() - i - 1);
        }

        return answer + num;
    }
}