import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<List<Object>> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            list.get(i).add(Integer.parseInt(st.nextToken()));
            list.get(i).add(st.nextToken());
        }

        list.sort(new Comparator<List<Object>>() {
            @Override
            public int compare(List<Object> l1, List<Object> l2) {
                return (int) l1.get(0) - (int) l2.get(0);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(list.get(i).get(0));
            sb.append(" ");
            sb.append(list.get(i).get(1));
            sb.append("\n");
        }

        System.out.println(sb);

    }
}
