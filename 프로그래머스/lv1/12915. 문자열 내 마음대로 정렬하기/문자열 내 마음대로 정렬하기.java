import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String[] solution(String[] strs, int n) {

        Arrays.sort(strs, new IndexBasedComparator(n));

        return strs;
    }

}

class IndexBasedComparator implements Comparator<String> {
    private final int n;

    public IndexBasedComparator(int n) {
        this.n = n;
    }

    @Override
    public int compare(String o1, String o2) {
        // n번째 인덱스 값 비교
        int result = Character.compare(o1.charAt(n), o2.charAt(n));

        // n번째 문자가 같을 때 사전순 정렬을 리턴
        if (result == 0) {
            return o1.compareTo(o2);
        }

        return result;
    }
}