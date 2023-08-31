import java.util.Arrays;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
        String[] answer = new String[n];
        
        for(int i = 0; i < n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]); // arr1[i]과 arr2[i] 둘 중 하나가 1이면 1 반환, 두 수가 0이면 0 반환
        }
        
        for(int i = 0; i < n; i++) {
            answer[i] = String.format("%" + n + "s", answer[i]);
            answer[i] = answer[i].replaceAll("1", "#");
            answer[i] = answer[i].replaceAll("0", " ");
        }
        
        return answer;
        
    }
    
}