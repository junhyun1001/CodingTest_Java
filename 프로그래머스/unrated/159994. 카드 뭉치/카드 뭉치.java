class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        int idx1 = 0;
        int idx2 = 0;
        for (String s : goal) {
            if (idx1 < cards1.length && s.equals(cards1[idx1])) { // idx1이 cards1의 범위를 넘지 않는 선에서 인덱스 검색
                idx1++;
            } else if (idx2 < cards2.length && s.equals(cards2[idx2])) { // idx2가 cards2의 범위를 넘지 않는 선에서 인덱스 검색
                idx2++;
            } else {
                answer = "No";
                break;
            }
        }

        return answer;
    }
}