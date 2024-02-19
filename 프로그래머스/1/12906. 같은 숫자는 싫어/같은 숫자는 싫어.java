import java.util.Queue;
import java.util.LinkedList;

public class Solution {
    public Queue<Integer> solution(int []arr) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i - 1] == arr[i]) {
                continue;
            }
            queue.offer(arr[i]);
        }
        return queue;
    }
}