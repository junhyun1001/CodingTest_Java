import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[][] numbers = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            numbers[i][0] = Integer.parseInt(st.nextToken());
            numbers[i][1] = Integer.parseInt(st.nextToken());
        }

        br.close();

        Arrays.sort(numbers, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        for (int i = 0; i < n; i++) {
            bw.write(String.valueOf(numbers[i][0]));
            bw.write(" ");
            bw.write(String.valueOf(numbers[i][1]));
            bw.newLine();
        }

        bw.close();

    }
}
