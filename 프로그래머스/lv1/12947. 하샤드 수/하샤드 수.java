class Solution {
    public boolean solution(int n) {
        String[] list = String.valueOf(n).split("");
        int sum = 0;
        for (String str : list) {
            sum += Integer.parseInt(str);
        }
        return n % sum == 0;
    }
}
