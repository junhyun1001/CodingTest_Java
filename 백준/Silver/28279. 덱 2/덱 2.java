import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static Deque<Integer> deque = new LinkedList<>();
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a;
            int b = 0;
            if (st.countTokens() == 2) {
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());
            } else {
                a = Integer.parseInt(st.nextToken());
            }

            switch (a) {
                case 1:
                    cmd1(b);
                    break;
                case 2:
                    cmd2(b);
                    break;
                case 3:
                    cmd3();
                    break;
                case 4:
                    cmd4();
                    break;
                case 5:
                    cmd5();
                    break;
                case 6:
                    cmd6();
                    break;
                case 7:
                    cmd7();
                    break;
                case 8:
                    cmd8();
                    break;
            }

        }

        System.out.println(sb);


    }

    public static void cmd1(int x) {
        deque.addFirst(x);
    }

    public static void cmd2(int x) {
        deque.addLast(x);
    }

    public static void cmd3() {
        if (!deque.isEmpty()) {
            sb.append(deque.removeFirst()).append("\n");
        } else {
            sb.append(-1).append("\n");
        }
    }

    public static void cmd4() {
        if (!deque.isEmpty()) {
            sb.append(deque.removeLast()).append("\n");
        } else {
            sb.append(-1).append("\n");
        }
    }

    public static void cmd5() {
        sb.append(deque.size()).append("\n");
    }

    public static void cmd6() {
        if (deque.isEmpty()) {
            sb.append(1).append("\n");
        } else {
            sb.append(0).append("\n");
        }
    }

    public static void cmd7() {
        if (!deque.isEmpty()) {
            sb.append(deque.getFirst()).append("\n");
        } else {
            sb.append(-1).append("\n");
        }
    }

    public static void cmd8() {
        if (!deque.isEmpty()) {
            sb.append(deque.getLast()).append("\n");
        } else {
            sb.append(-1).append("\n");
        }
    }

}