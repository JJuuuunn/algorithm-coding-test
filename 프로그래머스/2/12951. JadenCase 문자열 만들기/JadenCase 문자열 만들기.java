class Solution {
    public String solution(String s) {
        String answer = "";
        
        // 첫 글자인지 체크
        boolean check = true;
        
        // s를 전부 소문자로 변경 후 끊어서 sArr배열에 주입
        String[] sArr = s.toLowerCase().split("");
        
        for (String str : sArr) {
            // 첫 글자이면 대문자로 변경 아니면 그대로 주입
            answer += (check ? str.toUpperCase() : str);
            // 첫 글자 체크를 위한 조건문
            check = (str.equals(" ") ? true : false);
        }

        return answer;
    }
}