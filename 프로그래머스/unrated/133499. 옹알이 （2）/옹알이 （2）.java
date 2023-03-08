class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] word = {"aya", "ye", "woo", "ma"};
        String[] repeatWord = {"ayaaya", "yeye", "woowoo", "mama"};
        for (int i = 0; i < babbling.length; i++) {
            for (String s : repeatWord) {
                if (babbling[i].contains(s)) {
                    babbling[i] = "NULL!!";
                }
            }

            for (String w : word) {
                babbling[i] = babbling[i].replace(w, " ");
            }
            answer = babbling[i].replace(" ", "").length() == 0 ? answer + 1 : answer;
        }

        return answer;
    }
}