import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> deque = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());

        String cmd = "";
        int x = 0;
        for(int i = 0; i < n; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            if(st.countTokens() == 2) {
                cmd = st.nextToken();
                x = Integer.parseInt(st.nextToken());
            } else {
                cmd = st.nextToken();
            }

            switch(cmd) {
                case "push":
                    deque.addLast(x);
                    continue;
                case "pop":
                    if(deque.size() != 0) {
                        sb.append(deque.removeFirst());
                    } else {
                        sb.append(-1);
                    }
                    break;
                case "size":
                    sb.append(deque.size());
                    break;
                case "empty":
                    if(deque.size() == 0) sb.append(1);
                    else sb.append(0);
                    break;
                case "front":
                    if(deque.size() != 0) {
                        sb.append(deque.peekFirst());
                    } else {
                        sb.append(-1);
                    }
                    break;
                case "back":
                    if(deque.size() != 0) {
                        sb.append(deque.peekLast());
                    } else {
                        sb.append(-1);
                    }
                    break;
            }

            sb.append("\n");

        }

        System.out.println(sb);

    }
}
