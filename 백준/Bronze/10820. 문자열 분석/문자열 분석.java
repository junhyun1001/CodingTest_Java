import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int[] answer;

        String line;
        while ((line = br.readLine()) != null) {
            answer = new int[4];
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);

                if ('a' <= c && c <= 'z') {
                    answer[0]++;
                } else if ('A' <= c && c <= 'Z') {
                    answer[1]++;
                } else if ('0' <= c && c <= '9') {
                    answer[2]++;
                } else if (c == ' ') {
                    answer[3]++;
                }

            }

            sb.append(answer[0]).append(" ").append(answer[1]).append(" ").append(answer[2]).append(" ").append(answer[3]);
            System.out.println(sb);
            sb.setLength(0);

        }

    }
}
