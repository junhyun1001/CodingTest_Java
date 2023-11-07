import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cmd;
            int x = 0;
            if (st.countTokens() == 2) {
                cmd = Integer.parseInt(st.nextToken());
                x = Integer.parseInt(st.nextToken());
            } else {
                cmd = Integer.parseInt(st.nextToken());
            }

            switch (cmd) {
                case 1:
                    stack.push(x);
                    break;
                case 2:
                    if (!stack.isEmpty()) {
                        sb.append(stack.pop()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
                case 3:
                    sb.append(stack.size()).append("\n");
                    break;
                case 4:
                    if (stack.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case 5:
                    if (!stack.isEmpty()) {
                        sb.append(stack.peek()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
            }

        }

        System.out.println(sb);

    }
}
