import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int count = 1;
        int x = 1;
        n -= 1;
        while (n > 0) {
            n -= x * 6;
            x++;
            count++;
        }

        System.out.println(count);


    }
}