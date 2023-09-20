import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                list.add(i);
                if (n / i != i) {
                    list.add(n / i);
                }
            }
        }

        list.sort(Comparator.naturalOrder());

        if (list.size() < k) {
            System.out.println(0);
        } else {
            System.out.println(list.get(k - 1));
        }
    }
}
