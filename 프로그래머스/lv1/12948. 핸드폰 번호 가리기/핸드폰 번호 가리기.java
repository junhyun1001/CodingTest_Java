class Solution {
    public String solution(String phoneNumber) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < phoneNumber.length(); i++) {
            if (phoneNumber.length() - i > 4) {
                sb.append("*");
            } else sb.append(phoneNumber.charAt(i));

        }
        return String.valueOf(sb);
    }
}