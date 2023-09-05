import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int c = Integer.parseInt(br.readLine());

            sb.append(c / 25);
            sb.append(" ");
            c %= 25;

            sb.append(c / 10);
            sb.append(" ");
            c %= 10;

            sb.append(c / 5);
            sb.append(" ");
            c %= 5;

            sb.append(c);

            System.out.println(sb);

            sb.setLength(0);
        }
    }
}

/*
    Quarter($0.25) Dime($0.10) Nickel($0.05) Penny($0.01)
 */
