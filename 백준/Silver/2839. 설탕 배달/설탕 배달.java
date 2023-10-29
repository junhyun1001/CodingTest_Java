import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                int fx = 3 * i + 5 * j;
                if (fx == n) {
                    list.add(i + j);
                }
            }
        }

        list.sort(Comparator.naturalOrder());
        if (list.size() == 0) {
            list.add(-1);
        }
        System.out.println(list.get(0));


    }
}
