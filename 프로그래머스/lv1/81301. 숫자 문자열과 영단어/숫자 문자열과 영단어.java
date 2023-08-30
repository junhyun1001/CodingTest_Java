import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);

        StringBuilder result = new StringBuilder();
        StringBuilder currentWord = new StringBuilder();
        for (char ch : s.toCharArray()) {
            // 숫자일 때
            if (Character.isDigit(ch)) {
                result.append(ch);
            } else { // 문자일 때
                currentWord.append(ch);
                if (map.containsKey(currentWord.toString())) { // key가 현재 문자열과 일치할 때
                    result.append(map.get(currentWord.toString())); // key로 value 찾기
                    currentWord.setLength(0); // 일치하는 단어를 찾은 후 currentWord 비우기
                }
            }
        }

        return Integer.parseInt(result.toString());
    }
}