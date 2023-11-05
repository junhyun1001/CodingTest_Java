import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        // input arr
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // asc order
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        // put key & value by containsKey(), cnt
        Map<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        for (int i : sortedArr) {
            if (!map.containsKey(i)) {
                map.put(i, cnt++);
            }
        }

        // get value by key(arr)
        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(map.get(i)).append(" ");
        }

        System.out.println(sb);

    }
}