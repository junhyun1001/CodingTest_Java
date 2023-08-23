import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        String[] strArr = br.readLine().split(" ");

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        // 구간 합을 구하기 위한 합배열
        int[] arrSum = new int[n];
        arrSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            arrSum[i] = arrSum[i - 1] + arr[i];
        }

        for (int i = 0; i < m; i++) {
            String[] s1 = br.readLine().split(" ");
            int a = Integer.parseInt(s1[0]) - 1;
            int b = Integer.parseInt(s1[1]) - 1;
            if(a == 0) System.out.println(arrSum[b]);
            else System.out.println(arrSum[b] - arrSum[a - 1]);
        }
    }
}