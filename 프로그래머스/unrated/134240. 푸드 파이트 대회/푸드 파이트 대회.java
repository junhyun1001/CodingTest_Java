import java.util.*;

class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        String left = "";
        String right = "";
        
        int[] arr = new int[food.length];
        for(int i = 0; i < food.length; i++) {
            arr[i] = food[i] / 2; // 필요한 음식 개수 저장
        }
        
        for(int i = 1; i < arr.length; i++) {
            for(int j = 0; j < arr[i]; j++) {
                sb.append(i);
            }
        }
        
        left = String.valueOf(sb);
        right = sb.reverse().toString();
        
        sb = new StringBuilder();
        sb.append(left).append("0").append(right);
        

        return String.valueOf(sb);
    }
}