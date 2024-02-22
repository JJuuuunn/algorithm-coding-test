import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int maxHealth = health;
        int time = 0;
        for (int[] attack : attacks) {
            int attackTime = attack[0];
            int damage = attack[1];

            if (health < maxHealth) {
                health = Math.min(maxHealth, health + (bandage[1] * (attackTime - time - 1) + ((attackTime - time - 1) / bandage[0]) * bandage[2]));
            }
            time = attackTime;
            health -= damage;
            if (health <= 0) {
                return -1;
            }
        }
        return health;
    }
}