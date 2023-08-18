import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < s[1].length(); j++) {
                sb.append(String.valueOf(s[1].charAt(j)).repeat(Math.max(0, Integer.parseInt(s[0]))));
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }
}