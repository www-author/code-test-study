class Solution {
    public int solution(int a, int b) {
        
        int firstNum = Integer.parseInt(String.format("%s%s", a, b));
        int secondNum = Integer.parseInt(String.format("%s%s", b, a));
        int comparisonValue = firstNum - secondNum;
        int answer = comparisonValue == 0 ? 
                                 firstNum : (comparisonValue < 0 ?
                                                       secondNum : firstNum);
            
        return answer; 
    }
}