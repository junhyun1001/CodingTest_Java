import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append(str);
        }
        return Long.parseLong(String.valueOf(sb));
    }

}
