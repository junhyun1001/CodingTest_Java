class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c + n > 122 || (c + n > 90 && c + n < 96)) {
                sb.append((char) (c - 26 + n));
            } else if (c > 64 && c < 91 && c + n > 90) {
                sb.append((char) (c - 26 + n));
            } else if (c == ' ') {
                sb.append(c);
            } else sb.append((char) (c + n));
        }
        return String.valueOf(sb);
    }
}