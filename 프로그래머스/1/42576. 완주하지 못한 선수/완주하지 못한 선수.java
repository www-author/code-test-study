import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for (String item :  participant) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        for (String item : completion) {
            map.put(item, map.getOrDefault(item, 0) - 1);
        }

        for (Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return "";
    }
}