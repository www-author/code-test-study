import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;

        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();

        for (int num : lost) {
            lostSet.add(num);
        }

        for (int num : reserve) {
            if (lostSet.contains(num)) {
                lostSet.remove(num);
            } else {
                reserveSet.add(num);
            }
        }

        for (int student : reserveSet) {
            if (lostSet.contains(student - 1)) {
                lostSet.remove(student - 1);
            } else if (lostSet.contains(student + 1)) {
                lostSet.remove(student + 1);
            }
        }
        return answer - lostSet.size();
    }
}