import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        Stack<Character> stack = new Stack<>();

        int answer = 0;
        for (int i = 0; i < input.length(); i++) {

            // '('인 경우
            if (input.charAt(i) == '(') {
                stack.push('(');
            }
            // ')'인 경우
            else if (input.charAt(i) == ')') {
                // 레이저인 경우
                if (input.charAt(i - 1) == '(') {
                    stack.pop();
                    answer += stack.size();
                }
                // 일반 막대인 경우
                else if(input.charAt(i - 1) != '(') {
                    answer++;
                    stack.pop();
                }
            }

        }

        System.out.println(answer);

    }
}
