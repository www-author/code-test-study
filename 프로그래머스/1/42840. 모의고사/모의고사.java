import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int[] two =  {2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5};
        int[] three =  {3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] score = {0, 0, 0};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i % one.length]) {
                score[0]++;
            }
            if (answers[i] == two[i % two.length]) {
                score[1]++;
            }
            if (answers[i] == three[i % three.length]) {
                score[2]++;
            }
        }
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));

        List<Integer> winner = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < score.length; i++) {
            if (maxScore == score[i]) {
                winner.add(i + 1);
                count++;
            }
        }

        int[] result = new int[winner.size()];
        for (int i = 0; i < winner.size(); i++) {
            result[i] = winner.get(i);
        }
        return result;
    }
}