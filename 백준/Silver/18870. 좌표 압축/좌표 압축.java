import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        List<Integer> sortList = new ArrayList<>(list);
        sortList.sort(Comparator.naturalOrder());

        Map<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        for (int i : sortList) {
            if (!map.containsKey(i)) {
                map.put(i, cnt++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i : list) {
            sb.append(map.get(i)).append(' ');
        }

        System.out.println(sb);

    }
}