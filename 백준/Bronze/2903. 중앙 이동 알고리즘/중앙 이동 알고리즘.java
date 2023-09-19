import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int dot = 3;
        for(int i = 1; i < n; i++) {
            dot = dot * 2 - 1;
        }

        System.out.println(dot * dot);

    }
}
