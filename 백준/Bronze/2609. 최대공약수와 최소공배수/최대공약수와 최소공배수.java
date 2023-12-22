import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int x, y;
        x = Math.max(a, b);
        y = Math.min(a, b);

        int gcd;
        while (true) {
            int r = x % y;
            if (r == 0) {
                gcd = y;
                break;
            }
            x = y;
            y = r;
        }

        System.out.println(gcd);
        System.out.println(a * b / gcd);

    }
}
