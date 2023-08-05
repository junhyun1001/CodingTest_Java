import java.util.ArrayList;

class Solution {
    public ArrayList<Long> solution(long n) {
        ArrayList<Long> answer = new ArrayList<>();
        while (true) {
            answer.add(n % 10);
            n = n / 10;
            if (n == 0) break;
        }
        return answer;
    }
}