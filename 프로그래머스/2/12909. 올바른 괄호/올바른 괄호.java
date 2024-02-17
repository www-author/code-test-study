import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push('(');   
                continue;
            } 
            
            if (!stack.isEmpty()) {
                stack.pop();
                continue;
            } 
            return false;    
        }
        return stack.isEmpty();        
    }
}