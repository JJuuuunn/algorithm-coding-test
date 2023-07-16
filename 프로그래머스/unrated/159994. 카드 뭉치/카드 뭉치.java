class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int cardIdx1 = 0;
        int cardIdx2 = 0;
        int card1MaxIdx = cards1.length;
        int card2MaxIdx = cards2.length;

        for (int i = 0; i < goal.length; i++) {
            String curStr = goal[i];
            if (cardIdx1 < card1MaxIdx && curStr.equals(cards1[cardIdx1])) {
                cardIdx1++;
            } else if (cardIdx2 < card2MaxIdx && curStr.equals(cards2[cardIdx2])) {
                cardIdx2++;
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}