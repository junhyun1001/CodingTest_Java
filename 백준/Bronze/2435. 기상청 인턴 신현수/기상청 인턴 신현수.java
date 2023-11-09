import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int max = Integer.MIN_VALUE;
        while(true) {

            int temp = 0;
            for(int i = start; i < k; i++) {
                temp += arr[i];
            }

            if(temp > max) {
                max = temp;
            }

            if(k == n) break;

            start++;
            k++;


        }

        System.out.println(max);

    }
}
