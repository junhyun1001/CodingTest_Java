class Solution {
    public int solution(String t, String p) {
        int result = 0;
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            String substring = t.substring(i, i + p.length());
            long parseLong = Long.parseLong(substring);
            if (Long.parseLong(p) >= parseLong) {
                result++;
            }
        }
        return result;
    }
}