import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine().toUpperCase();

        Map<Character, Integer> map = new HashMap<>();
        // map의 특성을 이용해서 중복된 key는 덮어씌우고 value + 1 
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                Integer integer = map.get(s.charAt(i));
                map.put(s.charAt(i), ++integer);
            }
        }

        char c = ' ';
        int max = Integer.MIN_VALUE;
        // value에서 최대값을 찾고 해당 문자열 출력
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (max < entry.getValue()) {
                c = entry.getKey();
                max = entry.getValue();
            } else if (max == entry.getValue()) { // 최대값이 같은게 있으면 ? 출력
                c = '?';
            }
        }

        System.out.println(c);

    }
}
