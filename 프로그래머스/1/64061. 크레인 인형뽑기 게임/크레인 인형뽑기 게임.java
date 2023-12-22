import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < moves.length; i++) {
            for(int j = 0; j < board.length; j++) {
                int grab = board[j][moves[i] - 1];
                if(grab != 0) {
                    board[j][moves[i] - 1] = 0;
                    if(!stack.empty() && stack.peek() == grab) {
                        answer += 2;
                        stack.pop();
                        break;
                    }
                    stack.push(grab);
                    break;
                }
            }
        }
        
        System.out.println(stack);
        
        return answer;
    }
}

/*
	[1,5,3,5,1,2,1,4]
    
    1 -> board[4][1] = 4;
    5 -> board[2][5] = 3;
    3 -> board[2][3] = 1;
	
     1 2 3 4 5
  1 [0,0,0,0,0],
  2 [0,0,1,0,3],
  3 [0,2,5,0,1],
  4 [4,2,4,4,2],
  5 [3,5,1,3,1]
    
*/