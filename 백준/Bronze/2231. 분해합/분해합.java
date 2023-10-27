import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int answer = Integer.MAX_VALUE;

        for (int i = n; i >= 1; i--) {
            if (i + getSumOfDigit(i) == n && answer > i) {
                answer = i;
            }
        }

        if (answer == Integer.MAX_VALUE) answer = 0;

        System.out.println(answer);

    }

    public static int getSumOfDigit(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
