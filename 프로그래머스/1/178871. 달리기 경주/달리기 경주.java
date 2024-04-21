import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> ranks = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            ranks.put(players[i], i);
        }
        
        for (String player : callings) {
            int rank = ranks.get(player);
            String beforePlayer = players[rank - 1];
            
            players[rank - 1] = player;
            players[rank] = beforePlayer;
            
            ranks.put(player, rank - 1);
            ranks.put(beforePlayer, rank);
        }
        return players;
    }
}