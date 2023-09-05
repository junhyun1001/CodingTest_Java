import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        String result = Integer.toString(n, b);
        StringBuilder sb = new StringBuilder();
        for(char c : result.toCharArray()) {
            sb.append(Character.toUpperCase(c));
        }

        System.out.println(sb);

    }
}
