import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> lStack = new Stack<>();
        Stack<Character> rStack = new Stack<>();

        String word = br.readLine();
        for (int i = 0; i < word.length(); i++) {
            lStack.push(word.charAt(i));
        }

        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            String cmd = br.readLine();

            switch (cmd.charAt(0)) {
                case 'L':
                    if (!lStack.empty()) {
                        rStack.push(lStack.pop());
                    }
                    break;
                case 'D':
                    if (!rStack.empty()) {
                        lStack.push(rStack.pop());
                    }
                    break;
                case 'B':
                    if (!lStack.empty()) {
                        lStack.pop();
                    }
                    break;
                case 'P':
                    lStack.push(cmd.charAt(2));
                    break;
            }

        }

        StringBuilder sb = new StringBuilder();

        while (!lStack.empty()) {
            rStack.push(lStack.pop());
        }

        while (!rStack.empty()) {
            sb.append(rStack.pop());
        }

        System.out.println(sb);

    }
}