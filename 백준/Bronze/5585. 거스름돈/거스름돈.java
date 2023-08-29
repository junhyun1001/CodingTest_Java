import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] coin = {500, 100, 50, 10, 5, 1};
        int n = 1000 - Integer.parseInt(st.nextToken());

        int sum = 0;
        int i = 0;
        while (n != 0) {
            if (n >= coin[i]) {
                sum += n / coin[i];
                n = n % coin[i];
            } else {
                i++;
            }
        }
        System.out.println(sum);
    }
}