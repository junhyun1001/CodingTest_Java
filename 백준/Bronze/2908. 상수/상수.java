import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");

        int rev1 = reverse(Integer.parseInt(arr[0]));
        int rev2 = reverse(Integer.parseInt(arr[1]));

        System.out.println(Math.max(rev1, rev2));
    }

    public static int reverse(int n) {
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            sb.append(n % 10);
            n /= 10;
        }
        return Integer.parseInt(String.valueOf(sb));
    }
}