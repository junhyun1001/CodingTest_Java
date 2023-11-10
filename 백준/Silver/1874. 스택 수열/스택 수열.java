import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();

        int num = 1; // stack push 값
        for (int i = 0; i < n; i++) {
            // num <= input[i] 인 경우 push()
            while (num <= input[i]) {
                stack.push(num++);
                sb.append("+\n");
            }

            // num == input[i]가 같은 경우 pop()
            if (!stack.empty() && stack.peek() == input[i]) {
                stack.pop();
                sb.append("-\n");
            }
            // num > input[i]인 경우 NO
            else {
                sb.setLength(0);
                sb.append("NO");
                break;
            }

        }

        System.out.println(sb);
    }

}

