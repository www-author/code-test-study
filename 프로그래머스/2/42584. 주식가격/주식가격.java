import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Queue<Integer> q = new LinkedList<>();
        for(int x : prices) q.offer(x);
        int index = 0; 
        while (!q.isEmpty()) {
            int target = q.poll();
            for (int x : q) {
                answer[index]++; 
                if (target > x) break;
            }
            index++;

        }
        return answer; 
    }
}