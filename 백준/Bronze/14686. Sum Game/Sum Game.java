import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] swifts = new int[n];
        int[] sema = new int[n];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            swifts[i] = Integer.parseInt(st1.nextToken());
            sema[i] = Integer.parseInt(st2.nextToken());
        }

        int K = 0;
        int swiftsSum = 0;
        int semaSum = 0;

        for (int i = 0; i < n; i++) {
            swiftsSum += swifts[i];
            semaSum += sema[i];

            if (swiftsSum == semaSum) {
                K = i + 1;
            }
        }

        System.out.println(K);
    }
}
