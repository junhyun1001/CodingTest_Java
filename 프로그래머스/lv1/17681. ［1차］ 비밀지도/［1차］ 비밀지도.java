import java.util.Arrays;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
        String[] b1 = new String[n];
        String[] b2 = new String[n];
        
        for(int i = 0; i < n; i++) {
            b1[i] = String.format("%" + n + "s", Integer.toBinaryString(arr1[i])).replace(' ', '0');
            b2[i] = String.format("%" + n + "s", Integer.toBinaryString(arr2[i])).replace(' ', '0');
        }
        
        
        StringBuilder sb = new StringBuilder();
        String[] answer = new String[n];
        for(int i = 0; i < n; i++) {
            String s1 = b1[i];
            String s2 = b2[i];
            for(int j = 0; j < n; j++) {
                if(s1.charAt(j) == '0' && s2.charAt(j) == '0') {
                    sb.append(" ");
                } else sb.append("#");
            }
            answer[i] = String.valueOf(sb);
            sb.setLength(0);
        }
        
        return answer;
    }
    
}