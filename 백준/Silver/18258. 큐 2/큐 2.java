import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int x = 0;
        int last = x;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            if (cmd.equals("push")) {
                x = Integer.parseInt(st.nextToken());
            }

            switch (cmd) {
                case "push":
                    queue.add(x);
                    last = x;
                    continue;
                case "pop":
                    if (queue.isEmpty()) sb.append(-1);
                    else sb.append(queue.remove());
                    break;
                case "size":
                    sb.append(queue.size());
                    break;
                case "empty":
                    if (queue.isEmpty()) sb.append(1);
                    else sb.append(0);
                    break;
                case "front":
                    if (queue.isEmpty()) sb.append(-1);
                    else sb.append(queue.peek());
                    break;
                case "back":
                    if (queue.isEmpty()) sb.append(-1);
                    else sb.append(last);
                    break;

            }

            sb.append("\n");
        }

        System.out.println(sb);


    }
}
