import java.util.*;

class Solution {
    static int count = 0;
    public int solution(int[] nums) {
        
        for(int i = 0; i < nums.length - 2; i++) {
            for(int j = i + 1; j < nums.length - 1; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    isPrime(nums[i] + nums[j] + nums[k]);
                }
            }
        }
        
        
        return count;
    }
    
    public static void isPrime(int n) {
        for(int i = 2; i < Math.sqrt(n) + 1; i++) {
            if(n % i == 0) {
                return;
            }
        }
        count++;
    }
}