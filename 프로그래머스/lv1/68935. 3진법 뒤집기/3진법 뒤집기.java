class Solution {
    public int solution(int n) {
        String toTernary = Integer.toString(n, 3);
        String reverseTernary = new StringBuilder(toTernary).reverse().toString();
        return Integer.parseInt(reverseTernary, 3);
    }
}