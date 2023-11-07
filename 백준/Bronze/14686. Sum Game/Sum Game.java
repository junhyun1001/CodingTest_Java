import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int swiftsSum = 0;
        int semaSum = 0;
        int k = 0;
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            swiftsSum += Integer.parseInt(st1.nextToken());
            semaSum += Integer.parseInt(st2.nextToken());
            if (swiftsSum == semaSum) {
                k = i + 1;
            }
        }
        
        System.out.println(k);

    }
}
