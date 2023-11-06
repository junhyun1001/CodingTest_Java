import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<Integer> A = new HashSet<>(n);
        Set<Integer> B = new HashSet<>(m);

        st = new StringTokenizer(br.readLine());
        for (int i = 0;  i < n; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0;  i < m; i++) {
            B.add(Integer.parseInt(st.nextToken()));
        }

        Set<Integer> tempA = new HashSet<>(A);
        Set<Integer> tempB = new HashSet<>(B);

        tempA.removeAll(B);
        tempB.removeAll(A);

        System.out.println(tempA.size() + tempB.size());
    }
}
