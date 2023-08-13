/*
    짝수 -> 대문자
    홀수 -> 소문자
    공백이 그대로 유지되어야 함
 */
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int ptr = 0;
        for (char c : s.toCharArray()) {
            System.out.println(c + " : " + ptr);
            if (c != ' ') {
                if (ptr % 2 == 0) sb.append(String.valueOf(c).toUpperCase());
                else sb.append(String.valueOf(c).toLowerCase());
                ptr++;
            } else {
                ptr = 0;
                sb.append(c);
            }
        }
        return String.valueOf(sb);
    }
}