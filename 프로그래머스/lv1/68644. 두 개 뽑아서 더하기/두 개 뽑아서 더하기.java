import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = numbers.length - 1; j > i; j--) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        
        int[] answer = new int[set.size()];
        int i = 0;
        for (int x : list) {
            answer[i++] = x;
        }
        return answer;
    }
}