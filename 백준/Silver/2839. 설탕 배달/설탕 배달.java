import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());


        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                int fx = 3 * i + 5 * j;
                if (fx == n) {
                    if (min > i + j) {
                        min = i + j;
                    }
                }
            }
        }

        if (min == Integer.MAX_VALUE) min = -1;

        System.out.println(min);


    }
}
