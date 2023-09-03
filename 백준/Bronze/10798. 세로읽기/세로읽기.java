import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = new String[5];
        int maxLen = 0;
        for (int i = 0; i < line.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            line[i] = st.nextToken();
            if (maxLen < line[i].length()) maxLen = line[i].length();
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < maxLen; i++) {
            for (String word : line) {
                if (i < word.length()) {
                    result.append(word.charAt(i));
                }
            }
        }

        System.out.println(result);

    }
}