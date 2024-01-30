class Solution {
    public int solution(int[] array, int height) {
        int count = 0;
        
        for(int studentHeight : array) {
            if (studentHeight > height) {
                ++count;
            }
        }
        return count;
        
    }
}