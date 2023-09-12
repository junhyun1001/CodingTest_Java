import java.util.*;

class Solution {
    public static int count = 0;
    public int solution(int n) {
        
        for(int i = 2; i <= n; i++) {
            isPrime(i);
        }
        
        return count;
        
    }
    
    public static void isPrime(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return;
        }
        count++;
    }
}