class Solution {
    public int solution(int n, int k) {
        int answer = 0;    
        for (int i = 0; i < n; i++) {
            answer += 12000;
        }
        for (int i = 0; i< k-n/10; i++) {
            answer += 2000;
        }
        return answer;

    }
}