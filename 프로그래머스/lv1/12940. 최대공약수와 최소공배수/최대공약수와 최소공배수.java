import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        int gcd = getGCD(n, m);
        int lcm = getLCM(n, m, gcd);

        answer[0] = gcd;
        answer[1] = lcm;
        return answer;
    }

    public Set<Integer> addIntToSet(int x) {
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= x; i++) {
            if (x % i == 0)
                set.add(x / i);
        }
        return set;
    }

    public int getGCD(int n, int m) {
        Set<Integer> a = addIntToSet(n);
        Set<Integer> b = addIntToSet(m);
        Set<Integer> intersection = new HashSet<>(a);

        intersection.retainAll(b);
        int gcd = Integer.MIN_VALUE;
        for (int element : intersection) {
            if (gcd < element)
                gcd = element;
        }
        return gcd;
    }

    public int getLCM(int n, int m, int gcd) {
        return (n * m) / gcd;
    }
}