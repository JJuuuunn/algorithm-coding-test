class Solution {
    public int solution(String str1, String str2) {
        for(int i = 0; i < str2.length() - str1.length() + 1; i++) {
            if (str2.charAt(i) == str1.charAt(0)) {
                boolean flag = true;
                for (int j = 1; j < str1.length(); j++) {
                    if (str2.charAt(i + j) != str1.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) return 1;
            }
        }
        return 0;
    }
}