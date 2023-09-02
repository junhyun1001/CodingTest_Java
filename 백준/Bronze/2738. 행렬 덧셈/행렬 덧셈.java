import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n * 2][m];

        for (int i = 0; i < n * 2; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        /*
            arr[0][0] + arr[3][0], arr[0][1] + arr[3][1], arr[0][2] + arr[3][2]
         */

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(arr[i][j] + arr[i + n][j]);
                sb.append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }
}
