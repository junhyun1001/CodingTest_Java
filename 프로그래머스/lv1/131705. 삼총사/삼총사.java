class Solution {
    public int solution(int[] d) {
        int n = d.length;
        int result = 0;
        for(int i = 0; i < n-2; i++) {
            for(int j = i+1; j < n-1; j++) {
                for(int k = j+1; k < n; k++) {
                    if (d[i] + d[j] + d[k] == 0) {
                        result++;
                    }
                }
            }
        }
        return result;
    }
}