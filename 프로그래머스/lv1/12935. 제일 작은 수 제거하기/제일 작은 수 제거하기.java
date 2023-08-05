import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
//        OptionalInt optionalInt = Arrays.stream(arr).min();
//        int min = optionalInt.getAsInt();
        int min = arr[0];
        int[] answer;

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        
        if (arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                arrayList.add(arr[i]);
            }
        }

        int i = 0;
        answer = new int[arrayList.size()];
        for (int n : arrayList) {
            answer[i++] = n;
        }
        return answer;
    }
}