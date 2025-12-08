import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        List<String> list1 = toSet(str1);
        List<String> list2 = toSet(str2);
        
        if (list1.size()==0 && list2.size()==0) return 65536;
        int total = list1.size()+list2.size();
        for (String str : list1) {
            if (list2.indexOf(str)>=0) {
                answer++;
                list2.remove(str);
            }
        }
        double jacard = (double)answer/(total-answer);
        return (int)(jacard*65536);
    }
    
    public List<String> toSet(String str) {
        str = str.toLowerCase();
        List<String> list = new ArrayList<>();
        for (int i=0; i<str.length()-1; i++) {
            if (check(str.charAt(i))&&check(str.charAt(i+1))) {
                list.add(str.substring(i,i+2));
            }
        }
        return list;
    }
     
    public boolean check(char c) {
        if (c>='a'&&c<='z') return true;
        return false;
    }
}