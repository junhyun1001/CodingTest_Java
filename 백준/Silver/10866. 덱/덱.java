import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> deq = new LinkedList<>();

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
                case "push_front":
                    deq.addFirst(x);
                    continue;
                case "push_back":
                    deq.addLast(x);
                    continue;
                case "pop_front":
                    if(deq.size() != 0) {
                        sb.append(deq.removeFirst());
                    } else {
                        sb.append(-1);
                    }
                    break;
                case "pop_back":
                    if(deq.size() != 0) {
                        sb.append(deq.removeLast());
                    } else {
                        sb.append(-1);
                    }
                    break;
                case "size":
                    sb.append(deq.size());
                    break;
                case "empty":
                    if(deq.size() == 0) sb.append(1);
                    else sb.append(0);
                    break;
                case "front":
                    if(deq.size() != 0) {
                        sb.append(deq.peekFirst());
                    } else {
                        sb.append(-1);
                    }
                    break;
                case "back":
                    if(deq.size() != 0) {
                        sb.append(deq.peekLast());
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
