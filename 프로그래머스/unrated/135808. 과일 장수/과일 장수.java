import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        // 오름차순 정렬이기 때문에 i - m 값만 뽑아서 곱하고 더하면 됨
        for(int i = score.length; i >= m; i -= m) {
            answer += score[i - m] * m;
        }

        return answer;
    }
}