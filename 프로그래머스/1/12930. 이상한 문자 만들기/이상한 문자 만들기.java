class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(" ")) {
                idx = 0;
                answer += arr[i];
            } else if (idx % 2 == 0) {
                answer += arr[i].toUpperCase();
                idx++;
            } else {
                answer += arr[i].toLowerCase();
                idx++;
            }
        }
        return answer;
    }
}