import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String[] solution(String[] strs, int n) {

        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int result = Character.compare(s1.charAt(n), s2.charAt(n));
                if(result == 0) return s1.compareTo(s2);
                else return result;
            }
        });

        return strs;
    }
}