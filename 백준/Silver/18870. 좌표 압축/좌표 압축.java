import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] sortArr = arr.clone();
        Arrays.sort(sortArr);

        Map<Integer, Integer> map = new HashMap<>(n);
        int cnt = 0;
        for (int i : sortArr) {
            if (!map.containsKey(i)) {
                map.put(i, cnt++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(map.get(i)).append(' ');
        }

        System.out.println(sb);

    }
}