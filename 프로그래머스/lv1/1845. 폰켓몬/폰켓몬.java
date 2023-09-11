import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for(int i : nums) {
            if(nums.length / 2 <= set.size()) break;
            if(set.add(i)) {
                count++;
            }
        }
        
       return count; 
        
    }
}