class Solution {
    public String solution(String my_string, int k) {
            
        String lowerCaseString = my_string.toLowerCase();
        
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0; i < k; i++) {
            sb.append(lowerCaseString);
        }
        
        return sb.toString();
        
    }
}