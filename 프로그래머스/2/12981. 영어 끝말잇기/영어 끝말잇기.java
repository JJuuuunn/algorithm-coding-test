import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<>();
        // 첫 단어 주입
        list.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            // list 에 같은 단어가 들어 있으면 실행
            if (list.contains(words[i])) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }

            // 끝 단어로 시작하는 단어가 아닌 경우 싱행
            if (words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }

            // 단어 주입
            list.add(words[i]);
        }

        return answer;
    }
}