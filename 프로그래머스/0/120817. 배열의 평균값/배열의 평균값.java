class Solution {
    public double solution(int[] numbers) {
        double avg = 0;
        for(int number : numbers) {
            avg += number;
        }
        return avg / numbers.length; 
    }
}