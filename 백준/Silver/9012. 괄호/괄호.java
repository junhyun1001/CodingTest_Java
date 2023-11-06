import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            char[] input = br.readLine().toCharArray();
            for (char c : input) {
                if (cnt < 0) {
                    answer[i] = "NO";
                    break;
                } else if (c == '(') cnt++;
                else cnt--;
            }
            if (cnt == 0) answer[i] = "YES";
            else answer[i] = "NO";
        }

        StringBuilder sb = new StringBuilder();
        for (String s : answer) {
            sb.append(s).append("\n");
        }

        System.out.println(sb);

    }
}
