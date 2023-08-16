class Solution {
    public int solution(int[][] sizes) {
        int[][] arr = new int[sizes.length][2];
        for (int i = 0; i < sizes.length; i++) {
            arr[i][0] = Math.min(sizes[i][0], sizes[i][1]);
            arr[i][1] = Math.max(sizes[i][1], sizes[i][0]);
        }

        int w = Integer.MIN_VALUE;
        int h = Integer.MIN_VALUE;

        for (int[] ints : arr) {
            if (ints[0] > w) {
                w = ints[0];
            }
            if (ints[1] > h) {
                h = ints[1];
            }
        }

        return w * h;
    }
}