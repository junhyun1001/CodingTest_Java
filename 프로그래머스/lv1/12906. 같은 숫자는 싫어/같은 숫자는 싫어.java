import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (stack.peek() != arr[i]) {
                stack.add(arr[i]);
            }
        }

        int[] answer = new int[stack.size()];
        int i = 0;
        for (int x : stack) {
            answer[i++] = x;
        }
        return answer;
    }
}