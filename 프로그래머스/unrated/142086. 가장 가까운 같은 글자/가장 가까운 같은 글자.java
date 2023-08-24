import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        int[] answer = new int[s.length()];
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(set.add(c)) {
                answer[i] = -1;
            } else {
                // set 추가에 실패하고 문자열을 거꾸로 검사
                for(int j = i - 1; j >= 0; j--) {
                    if(c == s.charAt(j)) {
                        answer[i] = i - j;
                        break;
                    }
                }
            }
        }
        

        return answer;
    }
}
/*
	b a n a n a
    b: -1 (true)
    a: -1 (true)
    n: -1 (true)
    a: ? (false) -> for(j = i; j <= 0; j--)
    
    flase 일 때 for loop을 거꾸로 태우면 되나?
*/