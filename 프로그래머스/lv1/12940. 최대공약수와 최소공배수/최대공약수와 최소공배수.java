/*
    유클리드 호제법을 사용하여 최대공약수를 구할 수 있음
 */
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        answer[0] = getGCD(n, m);
        answer[1] = getLCM(n, m, answer[0]);
        return answer;
    }

    public int getGCD(int n, int m) {
        if (m == 0) return n;
        return getGCD(m, n % m);
    }

    public int getLCM(int n, int m, int gcd) {
        return n * m / gcd;
    }
}