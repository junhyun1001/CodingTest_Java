class Solution {
    boolean solution(String s) {
        int cnt = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'p') {
                cnt++;
                System.out.println(ch + " : " + cnt);
            } else if (ch == 'y') {
                System.out.println(ch + " : " + cnt);
                cnt--;
            }
        }
        return cnt == 0;
    }
}