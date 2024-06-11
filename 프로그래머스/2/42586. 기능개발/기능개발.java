import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
      Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            queue.offer((int) Math.ceil((100.0 - progresses[i]) / speeds[i]));
        }

        int point = 1;
        int day = queue.poll();
        while (!queue.isEmpty()) {
            if (queue.peek() > day) {
                list.add(point);
                point = 1;
                day = queue.poll();
                continue;
            }
            point++;
            queue.poll();
        }
        list.add(point);

        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}