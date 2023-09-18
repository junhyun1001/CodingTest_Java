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
        int score = 0;
        switch(count) {
            case 6: score = 1;
                break;
            case 5 : score = 2;
                break;
            case 4 : score = 3;
                break;
            case 3 : score = 4;
                break;
            case 2 : score = 5;
                break;
            default : score = 6;
        }
        return score;
    }
}