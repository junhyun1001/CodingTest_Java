import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        
        int answer = 0;
        
        for(int i = 1; i <= number; i++) {
            int divisorCnt = getDivisorCount(i);
            if(divisorCnt > limit) {
                answer += power;
            } else {
                answer += divisorCnt;
            }
        }
        
        return answer;
    }
    
    public static int getDivisorCount(int n) {
        int cnt = 0;
        for(int i = 1; i * i <= n; i++) {
            if(i * i == n) {
                cnt++;
            } else if(n % i == 0) {
                cnt += 2;
            }
        }
        
        return cnt;
    }
}