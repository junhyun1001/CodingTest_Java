import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine().toUpperCase();

        Map<Character, Integer> map = new HashMap<>();
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
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (max < entry.getValue()) {
                c = entry.getKey();
                max = entry.getValue();
            } else if (max == entry.getValue()) {
                c = '?';
            }
        }

        System.out.println(c);

    }
}