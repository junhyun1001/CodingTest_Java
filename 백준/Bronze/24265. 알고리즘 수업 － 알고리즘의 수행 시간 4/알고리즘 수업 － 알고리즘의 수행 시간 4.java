import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());

        long cnt = 0;
        for (long i = n - 1; i >= 1; i--) {
            cnt += i;
        }

        System.out.println(cnt);
        System.out.println(2);

    }


}
