class Solution {
    public int solution(int n) {
        int result = 0;
        for (int i = 10; i <= 100000000; i *= 10) {
            if (n / i >= 1 && n / i < 10) {
                result += n / i;
                result = getSum(n, i) + result;
            } else if (n < 10) {
                return n;
            }
        }
        return result;
    }

    public int getSum(int n, int i) {
        int sum = 0;
        for (int j = i / 10; j >= 1; j /= 10) {
            sum += n % (j * 10) / j;
        }
        return sum;
    }
}