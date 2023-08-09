import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String[] str = s.split("");
        
        Arrays.sort(str, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        for(String ss : str) {
            sb.append(ss);
        }
        
        return String.valueOf(sb);
    }
}