class Solution {
    public int solution(int n) {
        int sum = 0;
        int index = 0;
        
        while(index < n) {
            index++;
            if (index % 2 !=0){
                continue;
            }
            sum += index;
        }
        
        
        return sum;
    }
}