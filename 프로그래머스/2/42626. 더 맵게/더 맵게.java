import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int solution(int[] scoville, int K)     {
      int answer = 0;
        Queue<Integer> heap = new PriorityQueue<>();
        for (int num : scoville) {
            heap.offer(num);
        }

        while (heap.peek() < K) {
            if (heap.size() < 2) {
                return -1;
            }

            if (heap.peek() >= K) {
                break;
            }

            int firstMin = heap.poll();
            int secondMin = heap.poll();

            heap.offer(firstMin + secondMin * 2);
            answer++;
        }

        return answer;
    }
}