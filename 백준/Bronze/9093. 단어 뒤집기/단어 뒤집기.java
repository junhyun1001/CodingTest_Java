import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            String[] str = new String[st.countTokens()];
            for(int j = 0; j < str.length; j++) {
                str[j] = st.nextToken();
                for(int k = str[j].length() - 1; k >= 0; k--) {
                    sb.append(str[j].charAt(k));
                }
                sb.append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }
}
