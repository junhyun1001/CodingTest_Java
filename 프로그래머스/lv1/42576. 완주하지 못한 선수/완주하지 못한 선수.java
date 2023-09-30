import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        // map에 참가자와 참가자 수 매핑
        HashMap<String, Integer> map = new HashMap<>();
        for(String s : participant) {
            if(map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        
        // 완료한 참가자 value - 1
        for(String s : completion) {
            map.put(s, map.get(s) - 1);
        }
        
        // value가 1인 key를 찾아 answer에 리턴
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                answer = entry.getKey();
            }
        }
        
        return answer;
    }
}
