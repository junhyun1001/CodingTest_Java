import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int n : arr) {
            if (n % divisor == 0) {
                list.add(n);
            }
        }
        if (list.isEmpty()) {
            list.add(-1);
        }
        Collections.sort(list);
        return list;
    }
}