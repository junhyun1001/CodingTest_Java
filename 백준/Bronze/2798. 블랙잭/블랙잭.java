import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] numbers = new int[n];

        st = new StringTokenizer(br.readLine());
        int a = 0;
        while (st.hasMoreTokens()) {
            numbers[a++] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;
        for (int i = 0; i < numbers.length - 2; i++) {
            for (int j = i + 1; j < numbers.length - 1; j++) {
                for (int k = j + 1; k < numbers.length; k++) {
                    int temp = numbers[i] + numbers[j] + numbers[k];
                    if (temp <= m && answer < temp)
                        answer = temp;
                }
            }
        }

        System.out.println(answer);

    }
}
