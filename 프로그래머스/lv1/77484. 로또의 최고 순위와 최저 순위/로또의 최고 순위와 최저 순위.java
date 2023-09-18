class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] matches = new int[2];
        for(int i = 0; i < lottos.length; i++) {
            // 최고순의 일 때
            if(lottos[i] == 0) {
                matches[0]++;
            }
            for(int j = 0; j < win_nums.length; j++) {
                // 최저순의 일 때
                if(lottos[i] == win_nums[j]) {
                    matches[1]++;
                    matches[0]++;
                }
            }
        }
        
        int[] answer = new int[2];
        answer[0] = getScore(matches[0]);
        answer[1] = getScore(matches[1]);
        
        return answer;
    }
    
    public static int getScore(int count) {
        switch(count) {
            case 6 : return 1;
            case 5 : return 2;
            case 4 : return 3;
            case 3 : return 4;
            case 2 : return 5;
            default : return 6;
        }
    }
}