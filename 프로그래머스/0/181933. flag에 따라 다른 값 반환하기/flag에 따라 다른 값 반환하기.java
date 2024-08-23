class Solution {
    public int solution(int a, int b, boolean flag) {
        if (!flag) b *= -1;
        return a + b;
    }
}