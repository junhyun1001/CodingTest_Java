import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] scores = new int[3];
        
        // arr1,2,3의 길이가 벗어났을 때 다시 순회하는 방법은 i % arr.length를 이용하면 됨
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == arr1[i % arr1.length]) {
                scores[0]++;
            } 
            
            if(answers[i] == arr2[i % arr2.length]) {
                scores[1]++;
            }
            
            if(answers[i] == arr3[i % arr3.length]) {
                scores[2]++;
            }
        }
        
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < scores.length; i++) {
            if(scores[i] == maxScore) {
                list.add(i + 1);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
        
    }
}