class Solution {
    public String solution(String s) {
        String answer = "";
        
        boolean check = true;
        
        String[] sArr = s.toLowerCase().split("");
        
        for (String str : sArr) {
            answer += (check ? str.toUpperCase() : str);
            check = (str.equals(" ") ? true : false);
        }

        return answer;
    }
}