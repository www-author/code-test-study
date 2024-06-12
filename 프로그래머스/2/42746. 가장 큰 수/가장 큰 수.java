import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
                StringBuilder stringBuilder = new StringBuilder();
        String[] stringOfNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            stringOfNumbers[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(stringOfNumbers, (x, y) -> (y + x).compareTo(x + y));

        if(stringOfNumbers[0].equals("0")) return "0";
        
        return String.join("", stringOfNumbers);
        
        /*
        for (String number :stringOfNumbers) {
            stringBuilder.append(number);
        }
        return stringBuilder.toString();
        */
    }
}