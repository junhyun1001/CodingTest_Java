import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 최대공약수 구하기
            int x = a;
            int y = b;
            while(y != 0) {
                int temp = y;
                y = x % y;
                x = temp;
            }

            int gcd = x;
            int lcm = a * b / gcd;
            sb.append(lcm).append("\n");
        }

        System.out.println(sb);

    }
}
